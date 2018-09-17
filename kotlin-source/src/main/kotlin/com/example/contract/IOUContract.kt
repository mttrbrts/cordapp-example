package com.example.contract

import javax.script.ScriptEngine
import javax.script.ScriptEngineManager
import javax.script.ScriptContext
import javax.script.Invocable
import java.io.FileReader
import com.example.state.IOUState
import net.corda.core.contracts.CommandData
import net.corda.core.contracts.Contract
import net.corda.core.contracts.requireSingleCommand
import net.corda.core.contracts.requireThat
import net.corda.core.transactions.LedgerTransaction

/**
 * A implementation of a basic smart contract in Corda.
 *
 * This contract enforces rules regarding the creation of a valid [IOUState], which in turn encapsulates an [IOU].
 *
 * For a new [IOU] to be issued onto the ledger, a transaction is required which takes:
 * - Zero input states.
 * - One output state: the new [IOU].
 * - An Create() command with the public keys of both the lender and the borrower.
 *
 * All contracts must sub-class the [Contract] interface.
 */
class IOUContract : Contract {
    companion object {
        @JvmStatic
        val IOU_CONTRACT_ID = "com.example.contract.IOUContract"
        val engine = ScriptEngineManager().getEngineByName("nashorn")
        val engineContext = engine.getContext()
    }

    /**
     * The verify() function of all the states' contracts must not throw an exception for a transaction to be
     * considered valid.
     */
    override fun verify(tx: LedgerTransaction) {
        // Generic constraints around the IOU transaction.
        val out = tx.outputsOfType<IOUState>().single()
        val command = tx.commands.requireSingleCommand<Commands.Create>()
        requireThat {
            "No inputs should be consumed when issuing an IOU." using (tx.inputs.isEmpty())
            "Only one output state should be created." using (tx.outputs.size == 1)
            "All of the participants must be signers." using (command.signers.containsAll(out.participants.map { it.owningKey }))
        }

        /**
         * NOTES
         * @author matt@clause.io
         * 2018-09-17
         *
         * - This sample does not distinguish between the immutable contract model
         * and the output state for this transaction
         *
         * - Here we evaluate JavaScript with the Nashorn engine, it is preferable to use Ergo compiled to Java / Kotlin
         */

        // Initialise the contract model from the output state
        engineContext.setAttribute("out", out, ScriptContext.ENGINE_SCOPE)
        engine.eval("var contractModel = {"+
            "'\$class': 'org.accordproject.sample.corda.iou.IOUContractModel',"+
            "'lender': out.lender.toString(),"+
            "'borrower': out.borrower.toString(),"+
            "'value': out.value"+
        "}")

        // TODO refactor this into a CordaErgoEngine class
        // Load the compiled Ergo contract
        engine.eval(FileReader("./src/main/kotlin/com/example/contract/contract_es5.js"))

        // Initialize the Ergo contract
        engine.eval("var contractInstance = new orgXaccordprojectXsampleXcordaXiouXIOUContract();"+
            "var context = contractInstance.init({'emit':[], 'request':{'\$class': 'org.accordproject.cicero.runtime.Request'}});"
        )

        // Map the output state to an Ergo transaction
        engine.eval("var request = {"+
            "'\$class': 'org.accordproject.sample.corda.iou.IOURequest',"+
            "'value': out.value"+
        "};")

        // Execute the Ergo clause
        val success = engine.eval("context.left.tx = request; context.left.contract = contractModel;"+
                "context = contractInstance.verify(context.left);"+
                "print(JSON.stringify(context)); left in context") as Boolean

        if (!success) {
            val failureMessage = engine.eval("context.right.message") as String
            require(success) { failureMessage }
        }
        println("#######################")

    }

    /**
     * This contract only implements one command, Create.
     */
    interface Commands : CommandData {
        class Create : Commands
    }
}

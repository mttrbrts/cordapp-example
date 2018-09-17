# Example CorDapp with Modifications to execute an [Ergo](https://docs.accordproject.org) Contract.

Ergo is a domain specific language for smart legal contracts from the [Accord Project](https://accordproject.org)

This code is currently work in progress.

- Ergo Source https://github.com/mttrbrts/cordapp-example/blob/mr-cicero/cicero-source/corda-iou/lib/logic.ergo
- Kotlin Contract calling the compiled Ergo contract https://github.com/mttrbrts/cordapp-example/blob/mr-cicero/kotlin-source/src/main/kotlin/com/example/contract/IOUContract.kt

Compiling Ergo to ES5
```
ergo compile --cto models/model.cto  --ergo lib/logic.ergo --link true
```
Save the output as `contract.js`
```
babel contract.js --presets=@babel/env > contract_es5.js
```

Welcome to the example CorDapp. This CorDapp is documented [here](http://docs.corda.net/tutorial-cordapp.html).



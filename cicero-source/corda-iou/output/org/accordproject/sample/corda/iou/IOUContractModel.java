// this code is generated and should not be modified
package org.accordproject.sample.corda.iou;

import org.hyperledger.composer.system.*;
import org.hyperledger.composer.system.Event;
import org.hyperledger.composer.system.Transaction;
import org.hyperledger.composer.system.Participant;
import org.hyperledger.composer.system.Asset;
import org.accordproject.cicero.contract.*;
import org.accordproject.cicero.runtime.*;
public class IOUContractModel extends AccordContract {
   
   // the accessor for the identifying field
   public String getID() {
      return contractId;
   }

   public AccordParty lender;
   public AccordParty borrower;
   public double value;
}

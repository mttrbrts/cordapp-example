// this code is generated and should not be modified
package org.accordproject.cicero.contract;

import org.hyperledger.composer.system.*;
import org.hyperledger.composer.system.Event;
import org.hyperledger.composer.system.Transaction;
import org.hyperledger.composer.system.Participant;
import org.hyperledger.composer.system.Asset;
public abstract class AccordContract extends Asset {
   
   // the accessor for the identifying field
   public String getID() {
      return contractId;
   }

   public String contractId;
   public AccordParty[] parties;
}

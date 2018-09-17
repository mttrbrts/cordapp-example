// this code is generated and should not be modified
package org.accordproject.cicero.runtime;

import org.hyperledger.composer.system.*;
import org.hyperledger.composer.system.Event;
import org.hyperledger.composer.system.Transaction;
import org.hyperledger.composer.system.Participant;
import org.hyperledger.composer.system.Asset;
import org.accordproject.cicero.contract.*;
import org.accordproject.money.MonetaryAmount;
public class PaymentObligation extends Obligation {
   
   // the accessor for the identifying field
   public String getID() {
      return eventId;
   }

   public MonetaryAmount amount;
   public String description;
}

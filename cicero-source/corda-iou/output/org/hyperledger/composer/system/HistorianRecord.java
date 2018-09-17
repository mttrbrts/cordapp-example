// this code is generated and should not be modified
package org.hyperledger.composer.system;

import org.hyperledger.composer.system.*;
public class HistorianRecord extends Asset {
   
   // the accessor for the identifying field
   public String getID() {
      return transactionId;
   }

   public String transactionId;
   public String transactionType;
   public Transaction transactionInvoked;
   public Participant participantInvoking;
   public Identity identityUsed;
   public Event[] eventsEmitted;
   public java.util.Date transactionTimestamp;
}

// this code is generated and should not be modified
package org.hyperledger.composer.system;

import org.hyperledger.composer.system.*;
public class Identity extends Asset {
   
   // the accessor for the identifying field
   public String getID() {
      return identityId;
   }

   public String identityId;
   public String name;
   public String issuer;
   public String certificate;
   public IdentityState state;
   public Participant participant;
}

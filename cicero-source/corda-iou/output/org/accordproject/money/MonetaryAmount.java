// this code is generated and should not be modified
package org.accordproject.money;

import org.hyperledger.composer.system.*;
import org.hyperledger.composer.system.Event;
import org.hyperledger.composer.system.Transaction;
import org.hyperledger.composer.system.Participant;
import org.hyperledger.composer.system.Asset;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"$class"})
public class MonetaryAmount {
   public double doubleValue;
   public CurrencyCode currencyCode;
}

package objects_data_structure.law_of_demeter.claude.wrong;

import objects_data_structure.law_of_demeter.claude.auxiliar.CreditCard;

public class Wallet {
    public CreditCard getCreditCard() {
        return new CreditCard();
    }
}

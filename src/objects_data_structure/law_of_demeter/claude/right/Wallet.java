package objects_data_structure.law_of_demeter.claude.right;

import objects_data_structure.law_of_demeter.claude.auxiliar.CreditCard;
import objects_data_structure.law_of_demeter.claude.auxiliar.Product;

public class Wallet {
    private CreditCard creditCard;

    public void chargeForProduct(Product product) {
        creditCard.charge(product.getPrice());
    }
}

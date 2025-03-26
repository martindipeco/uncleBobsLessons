package objects_data_structure.law_of_demeter.claude.wrong;

import objects_data_structure.law_of_demeter.claude.auxiliar.CreditCard;
import objects_data_structure.law_of_demeter.claude.auxiliar.Product;

public class Customer {
    private Wallet wallet;

    public void buyProduct(Product product) {
        // Violates Law of Demeter: Reaching into wallet's card
        CreditCard card = wallet.getCreditCard();
        double balance = card.getBalance();

        if (balance >= product.getPrice()) {
            card.charge(product.getPrice());
        }
    }
}

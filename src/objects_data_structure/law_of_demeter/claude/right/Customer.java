package objects_data_structure.law_of_demeter.claude.right;

import objects_data_structure.law_of_demeter.claude.auxiliar.Product;

public class Customer {
    private Wallet wallet;

    public void buyProduct(Product product) {
        // Delegate responsibility to wallet
        wallet.chargeForProduct(product);
            // Process purchase
    }
}

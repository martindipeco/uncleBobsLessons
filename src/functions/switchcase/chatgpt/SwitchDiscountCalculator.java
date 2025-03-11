package functions.switchcase.chatgpt;

public class SwitchDiscountCalculator {
    public double calculateDiscount(Product product) {
        switch (product.getCategory()) {
            case ELECTRONICS:
                return product.getPrice() * 0.10;
            case CLOTHING:
                return product.getPrice() * 0.20;
            case GROCERIES:
                return product.getPrice() * 0.05;
            case SPORTS:
                return product.getPrice() * 0.40;
            default:
                throw new IllegalArgumentException("Unknown category: " + product.getCategory());
        }
    }
}

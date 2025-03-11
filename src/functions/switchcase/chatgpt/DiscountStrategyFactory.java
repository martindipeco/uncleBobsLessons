package functions.switchcase.chatgpt;

public class DiscountStrategyFactory {
    public static DiscountStrategy getStrategy(ProductCategory category) {
        switch (category) {
            case ELECTRONICS:
                return new ElectronicsDiscount();
            case CLOTHING:
                return new ClothingDiscount();
            case GROCERIES:
                return new GroceriesDiscount();
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
    }
}

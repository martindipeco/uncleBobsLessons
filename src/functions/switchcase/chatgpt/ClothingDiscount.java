package functions.switchcase.chatgpt;

public class ClothingDiscount implements DiscountStrategy {
    private double discount = 0.20;

    @Override
    public double applyDiscount(double price) {
        return price - (price * discount);
    }
}

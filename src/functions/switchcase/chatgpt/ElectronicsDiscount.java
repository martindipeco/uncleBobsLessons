package functions.switchcase.chatgpt;

public class ElectronicsDiscount implements DiscountStrategy {
    private double discount = 0.10;

    @Override
    public double applyDiscount(double price) {
        return price - (price * discount);
    }
}

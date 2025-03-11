package functions.switchcase.chatgpt;

public class GroceriesDiscount implements DiscountStrategy {
    private double discount = 0.05;
    @Override
    public double applyDiscount(double price) {
        return price - (price * discount);
    }
}

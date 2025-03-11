package functions.switchcase.chatgpt;

public class SportsDiscount implements DiscountStrategy{
    private double discount = 0.40;

    @Override
    public double applyDiscount(double price) {
        return price - (price * discount);
    }
}

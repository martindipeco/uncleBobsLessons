package functions.switchcase.grok.original;

public class ShippingOrder {
    private String shippingMethod;
    private double weight; // Weight in pounds

    public ShippingOrder(String shippingMethod, double weight) {
        this.shippingMethod = shippingMethod;
        this.weight = weight;
    }

    public String getShippingMethod() { return shippingMethod; }
    public double getWeight() { return weight; }
}

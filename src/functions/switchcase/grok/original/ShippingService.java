package functions.switchcase.grok.original;

import functions.switchcase.grok.exceptions.UnknownShippingMethodException;

public class ShippingService {
    public double calculateShippingCost(ShippingOrder order) throws UnknownShippingMethodException {
        switch (order.getShippingMethod()) {
            case "STANDARD":
                return calculateStandardShipping(order);
            case "EXPRESS":
                return calculateExpressShipping(order);
            case "OVERNIGHT":
                return calculateOvernightShipping(order);
            default:
                throw new UnknownShippingMethodException();
        }
    }

    private double calculateStandardShipping(ShippingOrder order) {
        return order.getWeight() * 0.5 + 5.0; // Base rate + flat fee
    }

    private double calculateExpressShipping(ShippingOrder order) {
        return order.getWeight() * 1.0 + 15.0; // Higher rate + higher fee
    }

    private double calculateOvernightShipping(ShippingOrder order) {
        return order.getWeight() * 2.0 + 25.0; // Premium rate + premium fee
    }


}

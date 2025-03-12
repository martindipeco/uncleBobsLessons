package functions.switchcase.grok.optimized;

import functions.switchcase.grok.exceptions.UnknownShippingMethodException;

public class ShippingFactoryImpl implements ShippingFactory {
    @Override
    public ShippingOrder createShipping(ShippingFee shippingFee) {
        switch (shippingFee) {
            case STANDARD:
                return new StandardShipping();
            case HIGH:
                return new HighShipping();
            case PREMIUM:
                return new PremiumShipping();
            default:
                try {
                    throw new UnknownShippingMethodException();
                } catch (UnknownShippingMethodException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}

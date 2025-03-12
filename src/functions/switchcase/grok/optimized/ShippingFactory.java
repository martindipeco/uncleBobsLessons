package functions.switchcase.grok.optimized;

import functions.switchcase.grok.exceptions.UnknownShippingMethodException;
import functions.switchcase.grok.optimized.ShippingOrder;

public interface ShippingFactory {
    ShippingOrder createShipping(ShippingFee shippingFee) throws UnknownShippingMethodException;
}

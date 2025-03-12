package functions.switchcase.grok.exceptions;

public class UnknownShippingMethodException extends Exception {
    public UnknownShippingMethodException() {
        super("Unknown shipping method");
    }
}

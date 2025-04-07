package error_handling.tests.claude;

public class StringCalculatorException extends Throwable{
    public StringCalculatorException(NumberFormatException e) {
        super("String must contain numbers", e);
        System.out.println(e);
    }
}

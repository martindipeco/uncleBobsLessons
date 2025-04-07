package error_handling.tests.claude;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class StringCalculatorTest {
    private StringCalculator calculator = new StringCalculator();
    private String emptyString = "";
    private String validChar = "1";
    private String invalidChar = "x";
    private String validMultipleChars = "1,2";
    private String invalidMultipleChars = "w,2";

    @Test
    public void emptyStringShouldReturnZero() throws StringCalculatorException {
        assertEquals(0, calculator.add(emptyString));
    }

    @Test
    public void validCharShouldReturnNumber() throws StringCalculatorException {
        assertEquals(1, calculator.add(validChar));
    }

    @Test(expected = StringCalculatorException.class)
    public void invalidCharShouldTrowNumberFormatException() throws StringCalculatorException {
        calculator.add(invalidChar);
    }

    @Test
    public void multipleNumbersShouldBeAdded() throws StringCalculatorException {
        assertEquals(3, calculator.add(validMultipleChars));
    }

    @Test(expected = StringCalculatorException.class)
    public void invalidCharsShouldThrowException() throws StringCalculatorException {
        calculator.add(invalidMultipleChars);
    }
}

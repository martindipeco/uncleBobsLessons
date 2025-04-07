package error_handling.tests.claude;

public class StringCalculator {
    //string passed as argument can contain several commma separated numbers
    public int add(String numbers) throws StringCalculatorException {
        if(numbers.isEmpty()) {
            return 0;
        } else if (numbers.contains(",")) {
            String[] numberArray = numbers.split(",");
            return tryToAddStrings(numberArray);
        } else {
            String[] numberArray = new String[] {numbers};
            return tryToAddStrings(numberArray);
        }
    }

    public int tryToAddStrings(String[] numberArray) throws StringCalculatorException {
        int sum = 0;
        try {
            for(String number : numberArray) {
                sum += Integer.parseInt(number);
            }
        } catch (NumberFormatException e) {
            throw new StringCalculatorException(e);
        }
        return sum;
    }
}

package error_handling.tests.claude;

public class StringCalculator {
    //can take several strings separated by a commma
    public int add(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }
        if(numbers.contains(",")) {
            String[] numberArray = numbers.split(",");
            int sum = 0;
            for(String number : numberArray) {
                sum += Integer.parseInt(number);
            }
            return sum;
        } else {
            return Integer.parseInt(numbers);
        }
    }
}

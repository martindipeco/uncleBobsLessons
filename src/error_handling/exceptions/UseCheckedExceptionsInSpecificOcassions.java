package error_handling.exceptions;

import java.io.IOException;  // This is a checked exception

public class UseCheckedExceptionsInSpecificOcassions {

    // the method declares the checked exception in its signature
    public static void main(String[] args) {
        try {
            accessArrayElement(5);
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // This method throws a checked exception
    public static void accessArrayElement(int index) throws IOException {
        int[] numbers = {1, 2, 3};

        if (index >= 0 && index < numbers.length) {
            System.out.println(numbers[index]);
        } else {
            throw new IOException("Invalid array index: " + index);
        }
    }
}

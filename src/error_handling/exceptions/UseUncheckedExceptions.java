package error_handling.exceptions;

public class UseUncheckedExceptions {

    private static int[] numbers = {1, 2, 3};

    public static void main(String[] args) {
        //option 1
        checkArrayBoundsBeforeAccessing(5);

        //option 2
        useTryCatch(5);

    }

    public static void checkArrayBoundsBeforeAccessing(int index) {
        if (index >= 0 && index < numbers.length) {
            System.out.println(numbers[index]);
        } else {
            System.out.println("Index out of bounds: " + index);
        }
    }

    public static void useTryCatch(int index) {
        try {
            System.out.println(numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

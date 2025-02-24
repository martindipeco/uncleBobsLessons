public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to MDP`s Uncle Bob Lessons");
        NamesContextUnclear.printGuessStatistics('A', 3);

        NamesContextClear namesContextClear = new NamesContextClear();
        char candidate = 'A';
        int count = 3;
        String message = namesContextClear.getMessage(candidate, count);
        System.out.println(message);

        count = 0;
        message = namesContextClear.getMessage(candidate, count);
        System.out.println(message);

        count = 1;
        message = namesContextClear.getMessage(candidate, count);
        System.out.println(message);
    }
}
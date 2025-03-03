import functions.sideeffects.UserValidatorNoSideEffects;
import functions.sideeffects.auxiliar.Session;
import names.ContextClear;
import names.ContextUnclear;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to MDP`s Uncle Bob Lessons");
        ContextUnclear.printGuessStatistics('A', 3);

        ContextClear namesContextClear = new ContextClear();
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

        UserValidatorNoSideEffects userValidatorNoSideEffects = new UserValidatorNoSideEffects();
        if (userValidatorNoSideEffects.checkPassword("user", "pass")) {
            Session.initialize();
        }
    }
}
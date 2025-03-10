import functions.separation.CommandQuerySeparation;
import functions.sideeffects.UserValidatorNoSideEffects;
import functions.sideeffects.auxiliar.Session;
import functions.switchcase.claude.NotificationFactoryImpl;
import functions.switchcase.claude.NotificationService;
import functions.switchcase.claude.NotificationType;
import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;
import functions.switchcase.claude.auxiliar.Message;
import names.ContextClear;
import names.ContextUnclear;

public class Main {
    public static void main(String[] args) throws InvalidNotificationTypeException {
        System.out.println("welcome to MDP`s Uncle Bob Lessons");

//        ContextUnclear.printGuessStatistics('A', 3);

//        ContextClear namesContextClear = new ContextClear();
//        char candidate = 'A';
//        int count = 3;
//        String message = namesContextClear.getMessage(candidate, count);
//        System.out.println(message);

//        count = 0;
//        message = namesContextClear.getMessage(candidate, count);
//        System.out.println(message);

//        count = 1;
//        message = namesContextClear.getMessage(candidate, count);
//        System.out.println(message);

//        UserValidatorNoSideEffects userValidatorNoSideEffects = new UserValidatorNoSideEffects();
//        if (userValidatorNoSideEffects.checkPassword("user", "pass")) {
//            Session.initialize();
//        }

//        CommandQuerySeparation commandQuerySeparation = new CommandQuerySeparation();
//        if (commandQuerySeparation.attributeExists("username")) {
//            commandQuerySeparation.setAttribute("username", "unclebob");
//        }

//        NotificationFactoryImpl notificationFactory = new NotificationFactoryImpl();
//        notificationFactory.makeNotification(NotificationType.EMAIL).send();
//
//        NotificationService notificationService = new NotificationService();
//        Message message = new Message(NotificationType.SMS, "Hola, te llegó un SMS");
//        notificationService.sendNotification(message);

    }
}
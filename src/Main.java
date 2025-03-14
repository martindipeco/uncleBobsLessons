import functions.switchcase.chatgpt.Product;
import functions.switchcase.chatgpt.ProductCategory;
import functions.switchcase.chatgpt.SwitchDiscountCalculator;
import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;
import functions.switchcase.claude.auxiliar.Message;
import functions.switchcase.claude.claudesolution.NotificationType;
import functions.switchcase.claude.mysolution.InvalidTypeNotificationExeption;
import functions.switchcase.claude.mysolution.NotificationFactoryImpl;
import functions.switchcase.claude.original.NotificationService;

public class Main {
    public static void main(String[] args) throws InvalidNotificationTypeException, InvalidTypeNotificationExeption {
        System.out.println("welcome to MDP`s Uncle Bob Lessons");

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(new Message(NotificationType.EMAIL, "This is an email"));

        NotificationFactoryImpl notificationFactory = new NotificationFactoryImpl();
        notificationFactory.createNotification(functions.switchcase.claude.mysolution.NotificationType.EMAIL);
    }
}
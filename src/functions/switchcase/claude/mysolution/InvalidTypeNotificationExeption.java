package functions.switchcase.claude.mysolution;

public class InvalidTypeNotificationExeption extends Exception {
    public InvalidTypeNotificationExeption (NotificationType notificationType) {
        super("Invalid Notification type: " + notificationType);
    }
}

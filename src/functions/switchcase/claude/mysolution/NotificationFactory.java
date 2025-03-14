package functions.switchcase.claude.mysolution;

public interface NotificationFactory {
    Notification makeNotification(NotificationType notificationType) throws InvalidTypeNotificationExeption;
}

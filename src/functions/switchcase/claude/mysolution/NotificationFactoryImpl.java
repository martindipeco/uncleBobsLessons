package functions.switchcase.claude.mysolution;

public class NotificationFactoryImpl {
    public Notification createNotification (NotificationType notificationType) throws InvalidTypeNotificationExeption {
        switch (notificationType) {
            case EMAIL:
                return new NotificationEmail();
            case PUSH:
                return new NotificationPush();
            case SMS:
                return new NotificationSms();
            default:
                throw new InvalidTypeNotificationExeption(notificationType);
        }
    }
}


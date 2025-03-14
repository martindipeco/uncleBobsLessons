package functions.switchcase.claude.claudesolution;

import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;

public class NotificationFactoryImpl implements NotificationFactory{
    @Override
    public Notification makeNotification(NotificationType notificationType) throws InvalidNotificationTypeException {
        switch (notificationType) {
            case EMAIL:
                return new EmailNotification(notificationType);
            case SMS:
                return new SmsNotification(notificationType);
            case PUSH:
                return new PushNotification(notificationType);
            case NEW:
                return new NewNotification(notificationType);
            default:
                throw new InvalidNotificationTypeException(notificationType);
        }
    }
}

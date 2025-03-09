package functions.switchcase.claude;

import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;

public class NotificationFactoryImpl implements NotificationFactory{
    @Override
    public Notification makeNotification(NotificationRecord notificationRecord) throws InvalidNotificationTypeException {
        switch (notificationRecord.notificationType) {
            case EMAIL:
                return new EmailNotification();
            case SMS:
                return new SmsNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new InvalidNotificationTypeException(notificationRecord.notificationType);
        }
    }
}

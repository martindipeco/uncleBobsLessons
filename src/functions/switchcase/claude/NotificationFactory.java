package functions.switchcase.claude;

import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;

public interface NotificationFactory {
    public Notification makeNotification(NotificationRecord notificationRecord) throws InvalidNotificationTypeException;
}

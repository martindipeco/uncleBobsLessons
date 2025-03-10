package functions.switchcase.claude;

import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;

public interface NotificationFactory {
    public Notification makeNotification(NotificationType notificationtype) throws InvalidNotificationTypeException;
}

package functions.switchcase.claude.claudesolution;

import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;

public interface NotificationFactory {
    public Notification makeNotification(NotificationType notificationtype) throws InvalidNotificationTypeException;
}

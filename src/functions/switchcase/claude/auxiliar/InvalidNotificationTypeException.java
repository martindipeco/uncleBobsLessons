package functions.switchcase.claude.auxiliar;

import functions.switchcase.claude.claudesolution.NotificationType;

public class InvalidNotificationTypeException extends Exception {
    public InvalidNotificationTypeException(NotificationType type) {
        super("Invalid message type: " + type);
    }
}

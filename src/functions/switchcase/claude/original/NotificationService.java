package functions.switchcase.claude.original;

import functions.switchcase.claude.auxiliar.InvalidNotificationTypeException;
import functions.switchcase.claude.auxiliar.Message;

public class NotificationService {
    public void sendNotification(Message message) throws InvalidNotificationTypeException {
        switch (message.getType()) {
            case EMAIL:
                sendEmailNotification(message);
                break;
            case SMS:
                sendSMSNotification(message);
                break;
            case PUSH:
                sendPushNotification(message);
                break;
            case NEW:
                sendNewNotification(message);
            default:
                throw new InvalidNotificationTypeException(message.getType());
        }
    }

    private void sendNewNotification(Message message) {
    }

    private void sendEmailNotification(Message message) {
        System.out.println("Sending email: " + message.getContent());
    }

    private void sendSMSNotification(Message message) {
        System.out.println("Sending SMS: " + message.getContent());
    }

    private void sendPushNotification(Message message) {
        System.out.println("Sending push notification: " + message.getContent());
    }
}

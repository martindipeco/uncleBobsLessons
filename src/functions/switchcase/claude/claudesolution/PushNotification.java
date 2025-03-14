package functions.switchcase.claude.claudesolution;

public class PushNotification extends Notification {
    public PushNotification(NotificationType notificationType) {
        super(notificationType);
    }

    @Override
    public void send() {
        System.out.println("You have a new " + notificationType.toString() + " message");
    }
}

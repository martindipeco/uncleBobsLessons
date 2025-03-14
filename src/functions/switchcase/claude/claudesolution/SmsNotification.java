package functions.switchcase.claude.claudesolution;

public class SmsNotification extends Notification {
    public SmsNotification(NotificationType notificationType) {
        super(notificationType);
    }

    @Override
    public void send() {
        System.out.println("You have a new " + notificationType.toString() + " message");
    }
}

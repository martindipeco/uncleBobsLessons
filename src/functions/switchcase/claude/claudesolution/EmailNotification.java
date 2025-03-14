package functions.switchcase.claude.claudesolution;

public class EmailNotification extends Notification {
    public EmailNotification(NotificationType notificationType) {
        super(notificationType);
    }

    @Override
    public void send() {
        System.out.println("You have a new " + notificationType.toString() + " message");
    }
}

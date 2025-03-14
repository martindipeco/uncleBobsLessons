package functions.switchcase.claude.claudesolution;

public class NewNotification extends Notification {
    public NewNotification(NotificationType notificationType) {
        super(notificationType);
    }

    @Override
    public void send() {
        System.out.println("You have a new " + notificationType.toString() + " message");
    }
}

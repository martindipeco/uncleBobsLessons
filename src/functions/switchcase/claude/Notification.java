package functions.switchcase.claude;

public abstract class Notification {
    protected NotificationType notificationType;

    public Notification (NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public abstract void send();
}

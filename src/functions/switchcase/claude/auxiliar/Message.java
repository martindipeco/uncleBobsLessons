package functions.switchcase.claude.auxiliar;

import functions.switchcase.claude.NotificationType;

public class Message {

    private NotificationType notificationType;
    private String content;

    public NotificationType getType() {
        return notificationType;
    }

    public Message (NotificationType notificationType, String content){
        this.notificationType = notificationType;
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

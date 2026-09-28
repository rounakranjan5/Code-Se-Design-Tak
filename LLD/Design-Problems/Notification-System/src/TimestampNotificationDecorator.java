import java.time.LocalDateTime;

public class TimestampNotificationDecorator extends INotificationDecorator{


    public TimestampNotificationDecorator(INotification iNotification) {
        super(iNotification);
    }

    @Override
    public String getContent() {
        return iNotification.getContent()+" -- "+ LocalDateTime.now();
    }
}

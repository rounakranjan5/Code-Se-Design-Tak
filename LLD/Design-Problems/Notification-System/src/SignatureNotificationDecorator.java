import java.time.LocalDateTime;

public class SignatureNotificationDecorator extends INotificationDecorator{

    private String sign;

    public SignatureNotificationDecorator(INotification iNotification,String sign) {
        super(iNotification);
        this.sign=sign;
    }

    @Override
    public String getContent() {
        return iNotification.getContent()+" -- "+ sign;
    }
}

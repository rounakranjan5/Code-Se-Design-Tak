package NotificationFormatterImpl;

public class SmsNotificationFormatter implements NotificationFormatter{

    @Override
    public void format() {
        System.out.println("formatted SMS Notification ###");
    }
}

package NotificationFormatterImpl;

public class EmailNotificationFormatter implements NotificationFormatter{

    @Override
    public void format() {
        System.out.println("formatted Email Notification ###");
    }
}

package NotificationFormatterImpl;

public class SlackNotificationFormatter implements NotificationFormatter{

    @Override
    public void format() {
        System.out.println("formatted Slack Notification ###");
    }
}

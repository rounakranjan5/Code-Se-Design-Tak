package NotificationImpl;

public class SlackNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Slack Notification ...");
    }
}

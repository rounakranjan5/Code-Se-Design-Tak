package AbstractFactory;

import NotificationFormatterImpl.EmailNotificationFormatter;
import NotificationFormatterImpl.SlackNotificationFormatter;
import NotificationImpl.*;

public class OnlineFormattedNotificationFactory implements FormattedNotificationFactory {

    @Override
    public Notification getNotification(String type){
        if (type.equals("Slack")) return new SlackNotification();
        if (type.equals("Email")) return new EmailNotification();
        return null;
    }

    @Override
    public void formatNotification(String type) {
        if (type.equals("Slack")) new SlackNotificationFormatter().format();
        if (type.equals("Email")) new EmailNotificationFormatter().format();
    }
}

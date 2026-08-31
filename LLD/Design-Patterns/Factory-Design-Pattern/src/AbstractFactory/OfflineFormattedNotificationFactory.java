package AbstractFactory;

import NotificationFormatterImpl.PushNotificationFormatter;
import NotificationFormatterImpl.SmsNotificationFormatter;
import NotificationImpl.Notification;
import NotificationImpl.PushNotification;
import NotificationImpl.SMSNotification;

public class OfflineFormattedNotificationFactory implements FormattedNotificationFactory {

    @Override
    public Notification getNotification(String type){
        if (type.equals("SMS")) return new SMSNotification();
        if (type.equals("PUSH")) return new PushNotification();
        return null;
    }

    @Override
    public void formatNotification(String type) {
        if (type.equals("SMS")) new SmsNotificationFormatter().format();
        if (type.equals("PUSH")) new PushNotificationFormatter().format();
    }
}

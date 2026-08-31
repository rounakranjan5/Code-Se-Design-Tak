package FactoryMethod;

import NotificationImpl.Notification;
import NotificationImpl.PushNotification;
import NotificationImpl.SMSNotification;
import SimpleFactory.NotificationFactory;

public class OfflineNotificationFactory implements NotificationFactory {

    @Override
    public Notification getNotification(String type){
        if (type.equals("SMS")) return new SMSNotification();
        if (type.equals("PUSH")) return new PushNotification();
        return null;
    }

}

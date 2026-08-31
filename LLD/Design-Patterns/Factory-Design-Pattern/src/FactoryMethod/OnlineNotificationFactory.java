package FactoryMethod;

import NotificationImpl.*;
import SimpleFactory.NotificationFactory;

public class OnlineNotificationFactory implements NotificationFactory {

    @Override
    public Notification getNotification(String type){
        if (type.equals("Slack")) return new SlackNotification();
        if (type.equals("Email")) return new EmailNotification();
        return null;
    }

}

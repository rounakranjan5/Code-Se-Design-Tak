package SimpleFactory;/*

    -----------   SIMPLE FACTORY UML ----------------

                         Client
                           |
                           | getNotification("EMAIL")
                           ↓
                +----------------------+
                | SimpleFactory.NotificationFactory  |
                +----------------------+
                | +getNotification()    |
                +----------------------+
                     /            \
                    /              \
                   ↓                ↓
          +---------------+  +---------------+
          |NotificationImpl.EmailNotification| |NotificationImpl.SMSNotification|
          +---------------+  +---------------+
          | +send()       |  | +send()       |
          +---------------+  +---------------+
                   \                /
                    \              /
                     ↓            ↓
                 +----------------+
                 |  NotificationImpl.NotificationImpl.Notification  |
                 | <<interface>>  |
                 +----------------+
                 | +send()        |
                 +----------------+

 */

import NotificationImpl.Notification;

public class SimpleFactoryClient {

    public static void main(String[] args) {

        NotificationSimpleFactory notificationSimpleFactory=new NotificationSimpleFactory();

//        NotificationImpl.NotificationImpl.Notification notification=notificationSimpleFactory.getNotification("Email");

//        NotificationImpl.NotificationImpl.Notification notification=notificationSimpleFactory.getNotification("SMS");

        Notification notification=notificationSimpleFactory.getNotification("Slack");

        notification.send();

    }



}

/*

    -----------   SIMPLE FACTORY UML ----------------

                         Client
                           |
                           | getNotification("EMAIL")
                           ↓
                +----------------------+
                | NotificationFactory  |
                +----------------------+
                | +getNotification()    |
                +----------------------+
                     /            \
                    /              \
                   ↓                ↓
          +---------------+  +---------------+
          |EmailNotification| |SMSNotification|
          +---------------+  +---------------+
          | +send()       |  | +send()       |
          +---------------+  +---------------+
                   \                /
                    \              /
                     ↓            ↓
                 +----------------+
                 |  Notification  |
                 | <<interface>>  |
                 +----------------+
                 | +send()        |
                 +----------------+

 */

public class SimpleFactoryClient {

    public static void main(String[] args) {

        NotificationSimpleFactory notificationSimpleFactory=new NotificationSimpleFactory();

//        Notification notification=notificationSimpleFactory.getNotification("Email");

//        Notification notification=notificationSimpleFactory.getNotification("SMS");

        Notification notification=notificationSimpleFactory.getNotification("Slack");

        notification.send();

    }



}

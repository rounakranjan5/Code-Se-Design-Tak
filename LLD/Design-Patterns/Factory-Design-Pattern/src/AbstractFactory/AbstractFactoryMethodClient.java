package AbstractFactory;

import NotificationImpl.Notification;

public class AbstractFactoryMethodClient {

    public static void main(String[] args) {
        String notificationMedium="Online";
        String notificationType="Email";

        if(notificationMedium.equals("Offline")){
            FormattedNotificationFactory notificationFactory=new OfflineFormattedNotificationFactory();
            Notification notification=notificationFactory.getNotification(notificationType);
            notification.send();
            notificationFactory.formatNotification(notificationType);
        }else{
            FormattedNotificationFactory notificationFactory=new OnlineFormattedNotificationFactory();
            Notification notification=notificationFactory.getNotification(notificationType);
            notification.send();
            notificationFactory.formatNotification(notificationType);
        }
    }

}

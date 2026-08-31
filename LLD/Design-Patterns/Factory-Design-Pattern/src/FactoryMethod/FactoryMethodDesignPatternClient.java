package FactoryMethod;

/*

        Factory Design Pattern is a creational design pattern** that provides a way to create objects without exposing the object creation logic to the client.

        The client asks the factory for an object, and the factory decides which concrete object to create.

        “Factory Design Pattern encapsulates object creation logic and provides the client with the required object without the client directly creating the concrete object using `new`.”


 */

import NotificationImpl.Notification;
import SimpleFactory.NotificationFactory;

public class FactoryMethodDesignPatternClient {

    public static void main(String[] args) {

        String notificationMedium="Offline";
        String notificationType="PUSH";

        if(notificationMedium.equals("Online")){
            NotificationFactory notificationFactory=new OnlineNotificationFactory();
            Notification notification=notificationFactory.getNotification(notificationType);
            notification.send();
        }else{
            NotificationFactory notificationFactory=new OfflineNotificationFactory();
            Notification notification=notificationFactory.getNotification(notificationType);
            notification.send();
        }


    }

}

package AbstractFactory;

import NotificationImpl.Notification;

public interface FormattedNotificationFactory {
    Notification getNotification(String type);
    void formatNotification(String type);
}

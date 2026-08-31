package SimpleFactory;

import NotificationImpl.Notification;

public interface NotificationFactory {
    Notification getNotification(String type);
}

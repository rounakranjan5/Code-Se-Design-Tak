import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private NotificationObservable notificationObservable;
    private static NotificationService instance;
    private List<INotification> notifications=new ArrayList<>();

    public NotificationService() {
        notificationObservable=new NotificationObservable();
    }

    public static NotificationService getInstance() {

        if(instance==null){
            instance=new NotificationService();
        }

        return instance;
    }

    public NotificationObservable getNotificationObservable(){
        return notificationObservable;
    }

    public void sendNotification(INotification iNotification){
        notifications.add(iNotification);
        notificationObservable.setCurrentNotification(iNotification);
    }

}

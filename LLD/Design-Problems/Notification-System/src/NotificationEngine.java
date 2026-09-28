import java.util.ArrayList;
import java.util.List;

public class NotificationEngine implements IObserver{

    private NotificationObservable notificationObservable;
    private List<INotificationStrategy> notificationStrategies=new ArrayList<>();

    public NotificationEngine(NotificationObservable notificationObservable) {
        this.notificationObservable=notificationObservable;
    }

    public void addNotificationStrategy(INotificationStrategy iNotificationStrategy){
        this.notificationStrategies.add(iNotificationStrategy);
    }

    @Override
    public void update() {
        String notificationContent=notificationObservable.getNotificationContent();

        for (INotificationStrategy strategy : notificationStrategies){
            strategy.send(notificationContent);
        }
    }

}

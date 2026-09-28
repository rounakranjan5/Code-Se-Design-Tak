import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements IObservable {

    private List<IObserver> observers=new ArrayList<>();
    private INotification currentNotification;


    @Override
    public void addObserver(IObserver iObserver) {
        observers.add(iObserver);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        observers.remove(iObserver);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers){
            observer.update();
        }
    }

    public String getNotificationContent(){
        return currentNotification.getContent();
    }

    public INotification getNotification(){
        return currentNotification;
    }

    public void setCurrentNotification(INotification iNotification){
        this.currentNotification=iNotification;
        notifyObservers();
    }

}

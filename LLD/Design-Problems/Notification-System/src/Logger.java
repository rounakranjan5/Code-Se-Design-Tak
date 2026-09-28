public class Logger implements IObserver {

    private NotificationObservable notificationObservable;

    public Logger(NotificationObservable notificationObservable) {
        this.notificationObservable = notificationObservable;
    }

    @Override
    public void update() {
        System.out.println("Logging New Notification : "+notificationObservable.getNotificationContent());
    }

}

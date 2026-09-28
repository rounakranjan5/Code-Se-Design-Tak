abstract class INotificationDecorator implements INotification {

    protected INotification iNotification;

    public INotificationDecorator(INotification iNotification) {
        this.iNotification = iNotification;
    }
}

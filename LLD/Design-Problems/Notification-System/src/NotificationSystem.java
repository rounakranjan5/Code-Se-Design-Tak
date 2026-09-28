public class NotificationSystem {

    public static void main(String[] args) {

        NotificationService notificationService=NotificationService.getInstance();

        NotificationObservable notificationObservable= notificationService.getNotificationObservable();

        Logger logger=new Logger(notificationObservable);

        NotificationEngine notificationEngine=new NotificationEngine(notificationObservable);

        notificationEngine.addNotificationStrategy(new EmailNotificationStrategy("xyz@abc.com"));
        notificationEngine.addNotificationStrategy(new SMSNotificationStrategy("+91 888XXXXX88"));
        notificationEngine.addNotificationStrategy(new PopUpNotificationStrategy());

        notificationObservable.addObserver(logger);
        notificationObservable.addObserver(notificationEngine);

        INotification notification=new SimpleNotification("Your order has been shipped!");
        notification=new TimestampNotificationDecorator(notification);
        notification=new SignatureNotificationDecorator(notification,"Customer Care");

        notificationService.sendNotification(notification);

    }

}

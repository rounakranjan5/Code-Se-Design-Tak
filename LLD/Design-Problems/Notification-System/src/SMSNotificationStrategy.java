public class SMSNotificationStrategy implements INotificationStrategy{

    private String mobNumb;

    public SMSNotificationStrategy(String mobNumb) {
        this.mobNumb = mobNumb;
    }

    @Override
    public void send(String content) {
        System.out.println("Sending SMS Notification to : "+mobNumb+" -- "+content);
    }
}

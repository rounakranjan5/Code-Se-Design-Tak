public class EmailNotificationStrategy implements INotificationStrategy{

    private String email;

    public EmailNotificationStrategy(String email) {
        this.email = email;
    }

    @Override
    public void send(String content) {
        System.out.println("Sending E-Mail Notification to : "+email+" -- "+content);
    }
}

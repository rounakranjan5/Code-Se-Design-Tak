public class PopUpNotificationStrategy implements INotificationStrategy{

    @Override
    public void send(String content) {
        System.out.println("Sending POP UP Notification to : "+" -- "+content);
    }

}

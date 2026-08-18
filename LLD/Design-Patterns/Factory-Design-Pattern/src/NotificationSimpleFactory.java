public class NotificationSimpleFactory {

    public Notification getNotification(String type){

        if(type.equals("SMS")) return new SMSNotification();
        if(type.equals("Slack")) return new SlackNotification();
        if(type.equals("Email")) return new EmailNotification();
        return null;
    }

}

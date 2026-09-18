import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel{

    List<ISubscriber> subscribers;
    String name;
    String title;

    public Channel(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        if(!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
        }
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubs() {
        for (ISubscriber s : subscribers){
            s.update();
        }
    }

    public void uploadVideo(String title){
        this.title=title;
        System.out.println(name+" Uploaded "+title);
        notifySubs();
    }

    public String getVideoData(){
        return "Checkout our new video : "+title+"\n";
    }
}

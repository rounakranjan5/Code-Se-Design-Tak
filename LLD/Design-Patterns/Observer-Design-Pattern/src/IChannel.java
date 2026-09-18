
// Observable

public interface IChannel {

    void subscribe(ISubscriber subscriber);
    void unsubscribe(ISubscriber subscriber);
    void notifySubs();

}

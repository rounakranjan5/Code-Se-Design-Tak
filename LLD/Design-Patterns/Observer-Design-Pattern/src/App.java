public class App {

    public static void main(String[] args) {

        Channel channel=new Channel("SystummGang");

        Subscriber s1=new Subscriber("TripleH",channel);
        Subscriber s2=new Subscriber("The Rock",channel);

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.uploadVideo("Be 200% Efficient");

        channel.unsubscribe(s1);

        channel.uploadVideo("Learn Core Java in 3 hrs");


    }

}

package Virtual_Proxy;

public class MainVirtualProxy {
    public static void main(String[] args) {
        ImageInterface image=new ProxyImage("test.png");
        image.display();
    }
}

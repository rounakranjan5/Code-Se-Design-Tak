package Virtual_Proxy;

public class ProxyImage implements ImageInterface{
    private RealImage realImage;
    private String name;

    public ProxyImage(String name) {
        this.name = name;
        this.realImage=null;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(name);
        }
        realImage.display();
    }
}

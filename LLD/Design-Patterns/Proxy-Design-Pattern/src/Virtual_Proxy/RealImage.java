package Virtual_Proxy;

public class RealImage implements ImageInterface {

    private String fileName;

    RealImage(String image){
        fileName=image;
        System.out.println("loading real image "+fileName+" from the disk");
    }

    @Override
    public void display() {
        System.out.println("displaying real image "+fileName);
    }
}

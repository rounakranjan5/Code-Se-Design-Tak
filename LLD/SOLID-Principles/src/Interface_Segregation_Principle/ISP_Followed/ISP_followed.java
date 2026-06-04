package Interface_Segregation_Principle.ISP_Followed;

interface TwoDmetrics{
    void area();
}

interface ThreeDmetrics{
    void area();
    void volume();
}

class Rectangle implements TwoDmetrics{

    private int length;
    private int width;

    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle is "+length*width);
    }

}

class Square implements TwoDmetrics{

    private int side;

    Square(int side){
        this.side=side;
    }

    @Override
    public void area() {
        System.out.println("Area of square is "+side*side);
    }

}

class Cube implements ThreeDmetrics{

    private int side;

    Cube(int side){
        this.side=side;
    }

    @Override
    public void area() {
        System.out.println("Area of cube is "+side*side*6);
    }

    @Override
    public void volume() {
        System.out.println("Volume of the Cube is "+side*side*side);
    }
}

public class ISP_followed {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(3,4);
        Square sqr=new Square(4);
        Cube cb=new Cube(4);

        rec.area();
        sqr.area();
        cb.area();

        cb.volume();
    }
}

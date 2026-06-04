package Interface_Segregation_Principle.ISP_Violated;

interface metrics{
    void area();
    void volume();
}

class Rectangle implements metrics{

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

    // LSP Violated
    @Override
    public void volume() {
        throw new UnsupportedOperationException("Volume can't be find");
    }
}

class Square implements metrics{

    private int side;

    Square(int side){
        this.side=side;
    }

    @Override
    public void area() {
        System.out.println("Area of square is "+side*side);
    }

    // LSP violated
    @Override
    public void volume() {
        throw new UnsupportedOperationException("Volume can't be find");
    }
}

class Cube implements metrics{

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

public class ISP_violated {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(3,4);
        Square sqr=new Square(4);
        Cube cb=new Cube(4);

        rec.area();
        sqr.area();
        cb.area();

        cb.volume();

        // LSP Violated
        try{
            rec.volume();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

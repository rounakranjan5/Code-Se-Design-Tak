public class SuvCar extends Car{
    public SuvCar(Engine e) {
        super(e);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving SUV##");
    }
}

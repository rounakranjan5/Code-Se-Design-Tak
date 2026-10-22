public class SedanCar extends Car {
    public SedanCar(Engine e) {
        super(e);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving Sedan##");
    }
}

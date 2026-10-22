public class Main {
    public static void main(String[] args) {
        Engine electricEngine=new ElectricEngine();
        Engine petrolEngine=new PetrolEngine();
        Engine dieselEngine=new DieselEngine();

        Car mySedan=new SedanCar(petrolEngine);
        Car mySuv=new SuvCar(electricEngine);
        Car mySuv2=new SuvCar(dieselEngine);

        mySedan.drive();
        mySuv.drive();
        mySuv2.drive();

    }
}

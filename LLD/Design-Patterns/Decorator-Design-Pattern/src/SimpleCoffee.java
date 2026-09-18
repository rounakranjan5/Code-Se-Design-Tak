public class SimpleCoffee implements ICoffee{

    @Override
    public String description() {
        return "Simple Coffee";
    }

    @Override
    public int getCost() {
        return 100;
    }
}

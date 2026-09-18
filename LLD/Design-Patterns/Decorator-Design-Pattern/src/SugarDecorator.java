public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description()+" + Sugar";
    }

    @Override
    public int getCost() {
        return super.getCost()+17;
    }
}

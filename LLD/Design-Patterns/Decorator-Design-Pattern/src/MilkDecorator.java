public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description()+" + Milk";
    }

    @Override
    public int getCost() {
        return super.getCost()+76;
    }
}

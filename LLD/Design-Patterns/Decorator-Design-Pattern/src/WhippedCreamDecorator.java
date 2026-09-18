public class WhippedCreamDecorator extends CoffeeDecorator{

    public WhippedCreamDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return super.description()+" + Whipped Cream";
    }

    @Override
    public int getCost() {
        return super.getCost()+119;
    }

}

public abstract class CoffeeDecorator implements ICoffee {

    protected ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description();
    }

    @Override
    public int getCost() {
        return coffee.getCost();
    }
}

public class App {

    public static void main(String[] args) {

        ICoffee coffee=new SimpleCoffee();
        System.out.println(coffee.description() + " => $"+coffee.getCost());

        coffee=new SugarDecorator(coffee);
        System.out.println(coffee.description() + " => $"+coffee.getCost());

        coffee=new MilkDecorator(coffee);
        System.out.println(coffee.description() + " => $"+coffee.getCost());

        coffee=new WhippedCreamDecorator(coffee);
        System.out.println(coffee.description() + " => $"+coffee.getCost());

    }

}

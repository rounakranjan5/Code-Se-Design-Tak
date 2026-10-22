public class Main {
    public static void main(String[] args) {
        MoneyHandler thousandHandler=new ThousandHandler(2);
        MoneyHandler fiveHundredHandler=new FiveHundredHandler(1);
        MoneyHandler twoHundredHandler=new TwoHundredHandler(3);
        MoneyHandler oneHundredHandler=new OneHundredHandler(4);

        thousandHandler.nextHandler(fiveHundredHandler);
        fiveHundredHandler.nextHandler(twoHundredHandler);
        twoHundredHandler.nextHandler(oneHundredHandler);

        int amtToWithdraw=3286;
        thousandHandler.dispense(amtToWithdraw);
    }
}

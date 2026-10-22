abstract class MoneyHandler {
    protected MoneyHandler nextHandler;

    public MoneyHandler() {
        this.nextHandler = null;
    }

    public void nextHandler(MoneyHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void dispense(int amount);
}

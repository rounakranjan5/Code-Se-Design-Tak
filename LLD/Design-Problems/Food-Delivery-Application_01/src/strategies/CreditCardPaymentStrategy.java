package strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String cardNumb;

    public CreditCardPaymentStrategy(String cardNumb) {
        this.cardNumb = cardNumb;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying $"+amount+" via credit card : XXXX XXXX "+cardNumb.substring(8));
    }

}

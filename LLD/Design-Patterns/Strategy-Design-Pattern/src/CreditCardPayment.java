public class CreditCardPayment implements PaymentStrategy {

    private String cardNum;

    public CreditCardPayment(String cardNum) {
        this.cardNum = cardNum;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of $"+amount+" Done Via Credit Card XXXX XXXX XXXX "+cardNum.substring(12));
    }
}

public class CryptoPayment implements PaymentStrategy{

    private String walledId;

    public CryptoPayment(String walledId) {
        this.walledId = walledId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of $"+amount+" Done via Cypto : "+walledId);
    }
}

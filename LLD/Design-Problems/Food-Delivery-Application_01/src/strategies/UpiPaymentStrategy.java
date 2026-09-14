package strategies;

public class UpiPaymentStrategy implements PaymentStrategy {

    private String upiId;

    public UpiPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying $"+amount+" Upi Id : "+upiId.substring(0,4)+"XXXXX");
    }

}



/*

            Strategy Design Pattern is a behavioral design pattern that defines a family of interchangeable algorithms, encapsulates each algorithm in a separate class, and allows the client to select or change the algorithm without modifying the context class.

 */

/*

            PaymentStrategy          → Strategy
            CreditCardPayment        → Concrete Strategy
            UpiPayment            → Concrete Strategy
            CryptoPayment            → Concrete Strategy

            CheckoutService          → Context

            PaymentApp               → Client

 */


public class PaymentApp {

  public static void main(String[] args) {

      CheckoutService checkoutService=new CheckoutService(new CreditCardPayment("1234567891243562"));
      checkoutService.checkout(450);

      checkoutService.setPaymentStrategy(new UpiPayment("systumm@example"));
      checkoutService.checkout(270);

      checkoutService.setPaymentStrategy(new CryptoPayment("systumm123"));
      checkoutService.checkout(478);

  }
}

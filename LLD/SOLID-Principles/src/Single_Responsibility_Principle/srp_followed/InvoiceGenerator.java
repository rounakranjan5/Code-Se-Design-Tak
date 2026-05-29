package Single_Responsibility_Principle.srp_followed;

import Single_Responsibility_Principle.Product;
import Single_Responsibility_Principle.srp_followed.ShoppingCart;

public class InvoiceGenerator {

    private ShoppingCart mycart;

    public InvoiceGenerator(ShoppingCart mycart){
        this.mycart=mycart;
    }

    void printInvoice(){
        System.out.println("--- Cart Items ---");

        int i=1;
        for(Product p : mycart.getItems() ){
            System.out.println(i+". "+p.name+" - "+p.price);
            i++;
        }

        System.out.println("Total : Rs."+mycart.totalPrice());

    }
}

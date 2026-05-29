package Single_Responsibility_Principle.srp_followed;

import Single_Responsibility_Principle.Product;
import Single_Responsibility_Principle.srp_followed.ShoppingCart;

public class srp_followed {

    public static void main(String[] args) {
        ShoppingCart mycart=new ShoppingCart();
        mycart.addItem(new Product("Mechanical Keyboard",7845));
        mycart.addItem(new Product("OverSized Tshirt",1250));
        mycart.addItem(new Product("Brand New Smartphone",27857));
        mycart.addItem(new Product("Mobile Cover",546));

        InvoiceGenerator invoice=new InvoiceGenerator(mycart);

        invoice.printInvoice();

        Save2DB dbsave=new Save2DB(mycart);
        dbsave.saveInDB();

    }

}

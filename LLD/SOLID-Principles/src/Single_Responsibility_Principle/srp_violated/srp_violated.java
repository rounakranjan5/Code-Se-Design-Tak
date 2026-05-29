package Single_Responsibility_Principle.srp_violated;

import Single_Responsibility_Principle.Product;

public class srp_violated {

    public static void main(String[] args) {
        ShoppingCart mycart=new ShoppingCart();
        mycart.addItem(new Product("Mechanical Keyboard",2845));
        mycart.addItem(new Product("OverSized Tshirt",1250));
        mycart.addItem(new Product("Brand New Smartphone",27857));
        mycart.addItem(new Product("Mobile Cover",546));

        mycart.printInvoice();
        mycart.saveToDB();

    }

}

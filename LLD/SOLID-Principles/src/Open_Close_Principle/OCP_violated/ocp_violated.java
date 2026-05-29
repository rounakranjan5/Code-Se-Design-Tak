package Open_Close_Principle.OCP_violated;

import Open_Close_Principle.Product;

public class ocp_violated {

    public static void main(String[] args) {
        ShoppingCart mycart=new ShoppingCart();

        mycart.addItem(new Product("OverSized Tshirt",1250));
        mycart.addItem(new Product("Brand New Smartphone",27857));
        mycart.addItem(new Product("Mobile Cover",546));

        mycart.saveToDB();
        mycart.saveToMongo();
    }
}

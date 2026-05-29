package Open_Close_Principle.OCP_followed;

import Open_Close_Principle.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> cartItems=new ArrayList<>();

    void addItem(Product p){
        cartItems.add(p);
    }

    List<Product> getItems(){
        return cartItems;
    }


}

interface SaveToDB{
    void saveData(ShoppingCart cart);
}
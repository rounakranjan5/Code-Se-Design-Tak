package Open_Close_Principle.OCP_violated;

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


    // violating OCP
    void saveToDB(){
        System.out.println("save to the db");
    }
    void saveToMongo(){
        System.out.println("save to the MongoDB");
    }

    void saveToMySql(){
        System.out.println("saved to the MySQL DB");
    }

}

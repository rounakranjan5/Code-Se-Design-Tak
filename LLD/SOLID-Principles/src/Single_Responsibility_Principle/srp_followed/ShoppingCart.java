package Single_Responsibility_Principle.srp_followed;

import Single_Responsibility_Principle.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> cartItems=new ArrayList<>();

    public void addItem(Product p){
        cartItems.add(p);
    }

    public List<Product> getItems(){
        return cartItems;
    }

    public int totalPrice(){
        int total=0;
        for(Product p : cartItems){
            total+=p.price;
        }
        return total;
    }


}

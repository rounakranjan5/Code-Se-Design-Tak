package Single_Responsibility_Principle.srp_violated;

import Single_Responsibility_Principle.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
    List<Product> cartItems=new ArrayList<>();

    void addItem(Product p){
        cartItems.add(p);
    }

    List<Product> getItems(){
        return cartItems;
    }

    // task 1 : calculating total price of the cart
    int totalPrice()
    {
        int total=0;
        for(Product p : cartItems){
            total+=p.price;
        }
        return total;
    }

    // violating SRP

    // task 2 : printing Invoice

    void printInvoice(){
        System.out.println("--- Cart Items ---");
        for(int i=0;i<cartItems.size();i++){
            System.out.println(i+1+". "+cartItems.get(i).name+" - "+cartItems.get(i).price);
        }

        System.out.println("Total : Rs."+totalPrice());
    }

    // task 3 : saving to DB
    void saveToDB(){
        System.out.println("Cart Data Saved to DB...");
    }


}

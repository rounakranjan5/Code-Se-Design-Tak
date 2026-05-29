package Single_Responsibility_Principle.srp_followed;

import Single_Responsibility_Principle.srp_followed.ShoppingCart;

public class Save2DB {
    private ShoppingCart mycart;

    Save2DB(ShoppingCart mycart){
        this.mycart=mycart;
    }

    void saveInDB(){
        System.out.println("Cart saved to the database...");
    }

}

import models.Order;
import models.Restaurent;
import models.User;
import strategies.UpiPaymentStrategy;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Tomato tomato=new Tomato();

        User user=new User(1,"John","delhi");

        System.out.println("User : "+user.getName()+" is ACTIVE!!");

        List<Restaurent> restaurentList=tomato.searchRestaurents("delhi");

        if(restaurentList.isEmpty()){
            System.out.println("No restaurents Found for this location");
            return;
        }

        System.out.println("Found Restaurents");
        for(Restaurent restaurent : restaurentList){
            System.out.println("- "+restaurent.getName());
        }

        tomato.selectRestaurent(user,restaurentList.get(0));
        System.out.println("Selected Restaurent : "+restaurentList.get(0).getName());

        tomato.addToCart(user,"A1");
        tomato.addToCart(user,"A3");

        tomato.printUserCart(user);

        Order order=tomato.checkoutNow(user,"Delivery",new UpiPaymentStrategy("4324249324"));

        tomato.payForOrder(user,order);
    }


}

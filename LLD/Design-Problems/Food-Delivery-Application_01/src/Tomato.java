import factories.NowOrderFactory;
import factories.OrderFactory;
import factories.ScheduleOrderFactory;
import managers.OrderManager;
import managers.RestaurentManager;
import models.*;
import services.NotificationService;
import strategies.PaymentStrategy;

import java.util.List;

public class Tomato {

    public Tomato(){
        intializeRestaurents();
    }

    public void intializeRestaurents(){
        Restaurent r1=new Restaurent("Karnataka Bhawan","Delhi");
        r1.addMenuItem(new MenuItem("A1","Masala Dosa",165));
        r1.addMenuItem(new MenuItem("A2","Idli combo",122));
        r1.addMenuItem(new MenuItem("A3","Filter Coffee",50));

        Restaurent r2=new Restaurent("Haldiram","Delhi");
        r2.addMenuItem(new MenuItem("H2","Chole Bhature",265));
        r2.addMenuItem(new MenuItem("H3","Lassi",170));

        Restaurent r3=new Restaurent("Mcdonalds","Mumbai");
        r3.addMenuItem(new MenuItem("M5","McAloo Tikki Burger",129));
        r3.addMenuItem(new MenuItem("M3","Fries(Med.)",135));

        RestaurentManager restaurentManager=RestaurentManager.getInstance();
        restaurentManager.addRestaurent(r1);
        restaurentManager.addRestaurent(r2);
        restaurentManager.addRestaurent(r3);

    }

    public List<Restaurent> searchRestaurents(String location){
        return RestaurentManager.getInstance().searchByLoc(location);
    }

    public void selectRestaurent(User user,Restaurent restaurent){
        Cart cart=user.getCart();
        cart.setRestaurent(restaurent);
    }

    public void addToCart(User user,String itemCode){
        Cart usercart=user.getCart();

        Restaurent restaurent=usercart.getRestaurent();

        if(restaurent==null){
            System.out.println("Please Select a Restaurent first!!");
            return;
        }

        for (MenuItem item : restaurent.getMenu()){
            if(item.getCode().equals(itemCode)){
                usercart.addItem(item);
                break;
            }
        }

    }


    public void printUserCart(User user){
        System.out.println("------ Your Cart -------");
        Cart userCart=user.getCart();
        List<MenuItem> items=userCart.getItems();
        for (MenuItem item : items){
            System.out.println("- "+item.getCode()+item.getName()+" - $"+item.getPrice());
        }

        System.out.println("Grand Total : $"+userCart.getTotalAmount());

    }

    public Order checkoutNow(User user, String orderType, PaymentStrategy paymentStrategy){
        return checkout(user,orderType,paymentStrategy,new NowOrderFactory());
    }

    public Order checkoutSchedule(User user, String orderType, PaymentStrategy paymentStrategy,String scheduleTime){
        return checkout(user,orderType,paymentStrategy,new ScheduleOrderFactory(scheduleTime));
    }

    public Order checkout(User user, String orderType, PaymentStrategy paymentStrategy, OrderFactory orderFactory){

        if(user.getCart().isEmpty()) return null;

        Cart userCart=user.getCart();
        Restaurent orderedRest=userCart.getRestaurent();
        List<MenuItem> itemsOrdered=userCart.getItems();

        int totalCost=userCart.getTotalAmount();

        Order order=orderFactory.createOrder(user,userCart,orderedRest,itemsOrdered,paymentStrategy,totalCost,orderType);

        OrderManager.getInstance().addOrder(order);
        return order;

    }


    public void payForOrder(User user,Order order){
        boolean paymentSuccess=order.processPayment();

        if (paymentSuccess){
            NotificationService notificationService=new NotificationService();
            notificationService.notify(order);
            user.getCart().clear();
        }
    }

}

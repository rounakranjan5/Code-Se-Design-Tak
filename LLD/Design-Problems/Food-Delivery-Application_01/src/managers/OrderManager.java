package managers;

import models.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private List<Order> orders=new ArrayList<>();

    private static OrderManager orderManagerinstance=null;

    public static OrderManager getInstance(){
        if(orderManagerinstance==null){
            orderManagerinstance=new OrderManager();
            return orderManagerinstance;
        }

        return orderManagerinstance;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void listOrders(){
        System.out.println("--- All Orders ---");
        for(Order order : orders){
            System.out.println(order.getType() + " order for " + order.getUser().getName()
                    + " | Total: ₹" + order.getTotal()
                    + " | At: " + order.getScheduled());        }
    }

}

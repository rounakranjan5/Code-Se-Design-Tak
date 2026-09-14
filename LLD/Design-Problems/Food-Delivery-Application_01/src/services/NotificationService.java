package services;
import models.MenuItem;
import models.Order;

public class NotificationService {

    public void notify(Order order){
        System.out.println("---------------------------------------");

        System.out.println("Notification - New!!! "+order.getType()+" Placed...");

        System.out.println("------ Order Details --------");
        System.out.println("Order Id : "+order.getOrderId());
        System.out.println("Customer Name : "+order.getUser().getName());
        System.out.println("Restaurent Name : "+order.getRestaurent().getName());

        System.out.println("=> Items Ordered");
        for(MenuItem ele : order.getItems()){
            System.out.println(ele.getName()+" - $"+ele.getPrice());
        }

        System.out.println("Total : $"+order.getTotal());
        System.out.println("Scheduled For : "+order.getScheduled());
        System.out.println("Payment Done");

        System.out.println("---------------------------------------");
    }

}

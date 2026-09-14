package factories;

import models.*;
import strategies.PaymentStrategy;
import utils.TimeUtils;
import java.util.List;

public class ScheduleOrderFactory implements OrderFactory {

    private String scheduleTime;

    public ScheduleOrderFactory(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    public Order createOrder(User user, Cart cart, Restaurent restaurent, List<MenuItem> menuItems, PaymentStrategy paymentStrategy, int totalCost, String orderType) {
        Order order=null;

        if(order.equals("Delivery")){
            DeliveryOrder deliveryOrder=new DeliveryOrder();
            deliveryOrder.setUserAddress(user.getAddress());
            order=deliveryOrder;
        }else{
            PickupOrder pickupOrder=new PickupOrder();
            pickupOrder.setResAddress(restaurent.getLocation());
            order=pickupOrder;
        }

        order.setUser(user);
        order.setItems(menuItems);
        order.setPaymentStrategy(paymentStrategy);
        order.setRestaurent(restaurent);
        order.setScheduled(TimeUtils.getCurrentTime());
        order.setTotal(totalCost);
        return order;

    }
}

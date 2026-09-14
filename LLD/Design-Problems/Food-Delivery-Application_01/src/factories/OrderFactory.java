package factories;


import models.*;
import strategies.PaymentStrategy;

import java.util.List;

public interface OrderFactory {
    Order createOrder(User user, Cart cart, Restaurent restaurent, List<MenuItem> menuItems, PaymentStrategy paymentStrategy,int totalCost,String orderType);
}

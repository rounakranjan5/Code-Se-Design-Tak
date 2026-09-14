package models;

import strategies.PaymentStrategy;

import java.util.List;

public abstract class Order {

    private static int nextOrderId=0;

    protected int orderId;
    protected User user;
    protected Restaurent restaurent;
    protected List<MenuItem> items;
    protected PaymentStrategy paymentStrategy;
    protected int total;
    protected String scheduled;

    public Order(){
        this.orderId=++nextOrderId;
        this.user=null;
        this.restaurent=null;
        this.paymentStrategy=null;
        this.total=0;
        this.scheduled="";
    }

    public boolean processPayment(){
        if (paymentStrategy!=null){
            paymentStrategy.pay(total);
            return true;
        }else {
            System.out.println("Please choose a payment mode first");
            return false;
        }
    }

    public abstract String getType();

    public User getUser(){
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public int getOrderId(){
        return orderId;
    }

    public Restaurent getRestaurent() {
        return restaurent;
    }

    public void setRestaurent(Restaurent restaurent) {
        this.restaurent = restaurent;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
        total=0;

        for (MenuItem item : items){
            total+=item.getPrice();
        }
    }
}

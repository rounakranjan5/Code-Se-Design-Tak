package models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Restaurent restaurent;

    private List<MenuItem> items=new ArrayList<>();

    public Cart() {
        this.restaurent = null;
    }

    public boolean isEmpty(){
        return restaurent==null || items.isEmpty() ;
    }

    public void clear(){
        items.clear();
        restaurent=null;
        System.out.println("Cart cleared !!!");
    }

    public Restaurent getRestaurent() {
        return restaurent;
    }

    public void setRestaurent(Restaurent restaurent) {
        this.restaurent = restaurent;
    }

    public void addItem(MenuItem item){
        if(restaurent==null){
            System.out.println("Add a restaurent before adding an item !1");
            return;
        }

        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public int getTotalAmount(){
        int amt=0;
        for(MenuItem item : items){
            amt+=item.getPrice();
        }

        return amt;
    }

}

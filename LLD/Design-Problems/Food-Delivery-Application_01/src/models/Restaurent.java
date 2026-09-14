package models;

import java.util.ArrayList;
import java.util.List;

public class Restaurent {

    private static int nextResId=0;

    private int resId;
    private String name;
    private String location;

    List<MenuItem> menu=new ArrayList<>();

    public Restaurent(String name, String location) {
        this.resId = ++nextResId;
        this.name = name;
        this.location = location;
    }

    public static int getNextResId() {
        return nextResId;
    }

    public static void setNextResId(int nextResId) {
        Restaurent.nextResId = nextResId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }
}

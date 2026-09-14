package models;

public class PickupOrder extends Order{

    private String resAddress;

    public PickupOrder(){
        resAddress="";
    }

    public String getUserAddress() {
        return resAddress;
    }

    public void setResAddress(String resAddress) {
        this.resAddress = resAddress;
    }

    @Override
    public String getType() {
        return "Pickup";
    }
}

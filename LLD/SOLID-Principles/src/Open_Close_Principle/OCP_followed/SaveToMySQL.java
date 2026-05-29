package Open_Close_Principle.OCP_followed;

public class SaveToMySQL implements SaveToDB{

    @Override
    public void saveData(ShoppingCart cart){
        System.out.println("Data saved to the MySQL...");
    }

}

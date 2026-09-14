package managers;

import models.Restaurent;

import java.util.ArrayList;
import java.util.List;

public class RestaurentManager {

    private List<Restaurent> restaurents=new ArrayList<>();

    private static RestaurentManager restaurentManagerInstance=null;

    public static RestaurentManager getInstance(){
        if(restaurentManagerInstance==null){
            restaurentManagerInstance=new RestaurentManager();
            return restaurentManagerInstance;
        }

        return restaurentManagerInstance;
    }

    public void addRestaurent(Restaurent restaurent){
        restaurents.add(restaurent);
    }

    public List<Restaurent> searchByLoc(String loc){
        List<Restaurent> result=new ArrayList<>();
        loc=loc.toLowerCase();
        for(Restaurent r : restaurents){
            String rloc=r.getLocation().toLowerCase();

            if (rloc.equals(loc)) result.add(r);

        }

        return result;
    }

}

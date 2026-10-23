package Remote_Proxy;

public class RealDataService implements DataServiceInterface{
    public RealDataService() {
        System.out.println("[RealDataService] initialized remote setup");
    }

    @Override
    public String fetchData() {
        return "[RealDataService] fetching real data from remote";
    }
}

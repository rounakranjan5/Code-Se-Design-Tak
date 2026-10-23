package Remote_Proxy;

public class ProxyDataService implements DataServiceInterface{
    private RealDataService realDataService;

    public ProxyDataService() {
        this.realDataService=new RealDataService();
    }

    @Override
    public String fetchData() {
        System.out.println("connecting proxy to remote setup");
        return realDataService.fetchData();
    }

}

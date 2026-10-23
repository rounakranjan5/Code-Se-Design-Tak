package Remote_Proxy;

public class MainRemoteProxy {
    public static void main(String[] args) {
        DataServiceInterface dataService=new ProxyDataService();
        System.out.println(dataService.fetchData());
    }
}

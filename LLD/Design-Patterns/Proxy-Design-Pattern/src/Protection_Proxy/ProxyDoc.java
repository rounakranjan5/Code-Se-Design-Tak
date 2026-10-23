package Protection_Proxy;

public class ProxyDoc implements IDocumentReader{

    private RealDocReader realDocReader;
    private User user;

    public ProxyDoc(User user) {
        this.realDocReader = new RealDocReader();
        this.user = user;
    }

    @Override
    public void unlockPDF(String filePath, String password) {
        if (!user.isPremiumMember){
            System.out.println("[ProxyDoc] Access denied for Non-Premium Members");
        }
        else realDocReader.unlockPDF(filePath,password);
    }
}

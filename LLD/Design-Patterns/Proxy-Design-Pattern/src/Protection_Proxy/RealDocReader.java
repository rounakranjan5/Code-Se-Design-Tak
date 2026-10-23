package Protection_Proxy;

public class RealDocReader implements IDocumentReader {
    @Override
    public void unlockPDF(String filePath, String password) {
        System.out.println("[RealDocReader] Unlocking Pdf at "+filePath);
        System.out.println("[RealDocReader] PDF Unlocked successfully with password : "+password);
        System.out.println("[RealDocReader] Displaying PDF Content...");
    }
}

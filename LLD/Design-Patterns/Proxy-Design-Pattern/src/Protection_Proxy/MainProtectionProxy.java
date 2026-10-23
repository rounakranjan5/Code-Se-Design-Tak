package Protection_Proxy;

public class MainProtectionProxy {
    public static void main(String[] args) {
        User user1=new User("Robert",false);
        User user2=new User("Jade",true);

        System.out.println("=== Non Premium User ===");
        IDocumentReader documentReader=new ProxyDoc(user1);
        documentReader.unlockPDF("protected_doc.pdf","123");

        System.out.println("=== Premium User ===");
        documentReader=new ProxyDoc(user2);
        documentReader.unlockPDF("protected_doc.pdf","123");

    }
}

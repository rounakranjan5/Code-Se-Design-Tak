public class AdapterPattern {

    public static void main(String[] args) {

        //adaptee
        XMLDataProvider xmlDataProvider=new XMLDataProvider();

        //adapter
        IReports adapter=new XMLDataProviderAdapter(xmlDataProvider);

        String rawData="Jack:37";

        Client client=new Client();

        client.getReport(adapter,rawData);
    }

}

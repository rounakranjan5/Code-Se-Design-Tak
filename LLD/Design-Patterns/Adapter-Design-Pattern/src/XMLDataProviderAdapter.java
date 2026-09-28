// adapter

public class XMLDataProviderAdapter implements IReports{

    private XMLDataProvider xmlDataProvider;

    public XMLDataProviderAdapter(XMLDataProvider xmlDataProvider) {
        this.xmlDataProvider = xmlDataProvider;
    }

    @Override
    public String getJSONdata(String data) {
        String XMLdata=xmlDataProvider.getXMLdata(data);

        int nameStartInd=XMLdata.indexOf("<name>")+6;
        int nameEndInd=XMLdata.indexOf("</name>");

        int idStartInd=XMLdata.indexOf("<id>")+4;
        int idEndInd=XMLdata.indexOf("</id>");

        String name=XMLdata.substring(nameStartInd,nameEndInd);
        String id=XMLdata.substring(idStartInd,idEndInd);

        return "{ \n" +
                "\t \"name\" : \""+name+"\" , \n" +
            "\t \"id\" : \""+id+"\" \n " +
            "}";

    }
}

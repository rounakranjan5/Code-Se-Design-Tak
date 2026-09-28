// adaptee
public class XMLDataProvider {

    String getXMLdata(String data){

        int sep=data.indexOf(':');
        String name=data.substring(0,sep);
        String id=data.substring(sep+1);

        return "<user> \n <name>"+name+"</name>"+"\n"+"<id>"+id+"</id> \n </user>";

    }

}

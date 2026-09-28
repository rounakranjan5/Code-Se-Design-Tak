public class Client {
    public void getReport(IReports report,String rawData){
        System.out.println("Processed JSON Data : \n"+report.getJSONdata(rawData));
    }
}

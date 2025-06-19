import java.sql.Timestamp;
import java.util.Date;
public class Timestamp_To_Date {
    public static void main(String[] args){
        Timestamp ts=new Timestamp(System.currentTimeMillis());
        Date  date=new Date(ts.getTime());
        System.out.println("Original Timestamp: "+ts);
        System.out.println("Converted Date: "+date);
    }
}

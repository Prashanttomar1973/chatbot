import java.sql.Timestamp;
import java.util.Date;
public class Date_To_Timestamp {
    public static void main(String[] args){
        Date date=new Date();
        Timestamp ts=new Timestamp(date.getTime());
        System.out.println("Date to Timestamp conversion: "+ts);
    }
}

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class date_To_String {
    public static void main(String[] args){
//        Date date=new Date(); used it instead of below line.
        Date date=Calendar.getInstance().getTime();
        DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss");
        String strDate=dateFormat.format(date);
        System.out.println("Converted String: "+strDate);
    }
}

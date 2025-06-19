import java.text.SimpleDateFormat;
import java.util.Date;
public class String_to_Date_conversion {
public static void main(String[] args)throws Exception{
    String strdate="11/3/1905";
    Date date=new SimpleDateFormat("dd/MM/yyyy").parse(strdate);
    System.out.println(strdate+"\t"+date);

}
}

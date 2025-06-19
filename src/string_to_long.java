public class string_to_long {
    public static void main(String[] args){
        String numstr="1234567890123333345";
        long longvalue=Long.parseLong(numstr);
        System.out.println("Converted string to Long: "+longvalue);
    }
}

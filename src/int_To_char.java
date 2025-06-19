public class int_To_char {
    public static void main(String[] args){
        int redix=16;
        int a=10;
        char c=Character.forDigit(a,redix);
        System.out.println("Int to char conversion: "+c);
    }
}

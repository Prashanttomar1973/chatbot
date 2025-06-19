public class String_to_Double {
    public static void main(String[] args){
        String s="23.5";
        Double double_value=Double.valueOf(s);
        System.out.println("Before conversion string value: "+s);
        System.out.println("After conversion String to double value: "+double_value);
    }
}

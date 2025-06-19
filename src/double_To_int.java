public class double_To_int {
    public static void main(String[] args){
        double dv=10.75;
        int intval=Double.valueOf(dv).intValue();
        System.out.println("Converted int value: "+intval);
    }
}

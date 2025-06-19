import java.util.*;

public interface ad_binary {
    static String  add_binary(String x,String y){
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int sum=num1+num2;
        String result=Integer.toBinaryString(sum);
        return result;

    }
    public static void main(String[] args){
        Scanner b=new Scanner(System.in);
        System.out.println("Enter the String in form of binary number:");
        String x=b.nextLine();
        String y=b.nextLine();
        System.out.println("Sum of the binary String is "+add_binary(x,y));
    }
}

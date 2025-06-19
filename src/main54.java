import java.util.*;
public class main54 {
        static int swapping(int a,int b){
        System.out.println("Numbers after the swapping:");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        return 0;
    }

        public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number1 and number2:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("Numbers before the swapping"+"\n"+a+" "+b);
        swapping(a,b);
    }
}

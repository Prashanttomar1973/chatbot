
import java.util.*;
public class reverse29 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=ob.nextInt();
       int a=0;
       int b=1;
       int m=0;
       if(n==1){
           System.out.println("0");
       }
       else if(n==2){
           System.out.println("0 1");
       }
        else
        {
            System.out.print(a+" ");
            System.out.print(b+" ");
            for (int i =1 ; i <= n-2; i++) {
                m=m+(a+b);
                System.out.print(m+" ");

            }
        }

    }
}

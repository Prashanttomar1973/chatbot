import java.sql.SQLOutput;
import java.util.*;
public class readtonum {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=obj.nextInt();
       int temp=0;
       int rem=0;
       for(int i=1;n!=0;i++){
           rem=n%10;
           temp=temp*10+rem;
           n/=10;
       }
        System.out.println("The reverse number is "+temp);
    }
}

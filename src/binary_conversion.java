import java.util.Scanner;
public class binary_conversion {
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int ans=0;
        int pw=1;
        while(n>0)
        {
            int unit_di=n%10;
            ans+=(unit_di*pw);
            n/=10;
            pw=pw*2;
        }
        System.out.println(ans);

    }
}

import java.util.Scanner;

public class a_to_the_power_b {
    public static void main(String[] args)
    { Scanner ob=new Scanner(System.in);
        System.out.println("Enter the base number:");
        int a=ob.nextInt();
        System.out.println("Enter the power number:");
        int b=ob.nextInt();
        int num=1;
        for(int i=1;i<=b;i++)
        {
             num=num*a;
        }
        System.out.println(num);

    }
}

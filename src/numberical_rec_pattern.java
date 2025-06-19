import java.util.Scanner;
public class numberical_rec_pattern {
    public static void main(String[] args)
    { Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number for pattern:");
        int n=ob.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n ;j++)
        {
            System.out.print(j);
        }


            System.out.println();
        }

    }
}

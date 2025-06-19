 import java.util.Scanner;
public class pyramid_pattern {
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        { for(int j=1;j<=n+3;j++)
        {if(i==4 || i+j==5 || j-i==3)
            {
                System.out.print(i);

            }
            else{
            System.out.print(" ");
                 }
            }
            System.out.println();
        }

    }
}

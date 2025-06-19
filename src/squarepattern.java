import java.util.Scanner;
public class squarepattern {
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for row:");
        int r=sc.nextInt();
        System.out.println("Enter the number for column:");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
        {
            if(i==1 || i==r || j==1 || j==c)
            {System.out.print(" *");}
            else
            {System.out.print(" ");}

        }
            System.out.println();
        }

    }
}

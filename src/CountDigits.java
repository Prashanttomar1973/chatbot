import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args)
    { Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        int org_n=n;
        while(n>0)
        {
            n=n/10;
            digit++;
        }
        System.out.println("The number of digit in nuber"+org_n+"is"+digit);

    }
}




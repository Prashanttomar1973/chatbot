import java.util.Scanner;
public class dec_to_bin {
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int cont=1;
        int ans=0;

        while(n>0)
        {  int ab=n%2;
            ans=ans+(ab*cont);
            cont=cont*10;
          n=n/2; 

        }

        System.out.println(ans);
    }
}

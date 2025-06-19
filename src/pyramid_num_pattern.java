import java.util.Scanner;
public class pyramid_num_pattern {
       public static void main(String[] args)
       { Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           for(int i=1;i<=n;i++)
           { for(int j=1;j<=n-i;j++)
           {
               System.out.print(" ");
           }
           if(i==1) {
               for (int k = i; k <= 2 * i - 1; k++) {
                   System.out.print(i);
               }
           }
               if(i==2) {
                   for (int k = i; k <= 2 * i - 3; k++) {
                       System.out.print(i+" ");
                   }
               }
               if(i==3) {
                   for (int k = i; k <= 2 * i - 1; k++) {
                       System.out.print(i+" "+" ");
                   }
               }
               if(i==4) {
                   for (int k = i; k <= 2 * i - 1; k++) {
                       System.out.print(i);
                   }
               }
           if(i==1) {
               for (int l = i - 1; l >= 1; l--) {
                   System.out.print(i);
               }
           }
               if(i==2) {
                   for (int l = i - 1; l >= 1; l--) {
                       System.out.print(i);
                   }
               }
               if(i==3) {
                   for (int l = i - 1; l >= 2; l--) {
                       System.out.print(" "+i);
                   }
               }
               if(i==4) {
                   for (int l = i - 1; l >= 1; l--) {
                       System.out.print(i);
                   }
               }
               System.out.println();

           }

       }
}

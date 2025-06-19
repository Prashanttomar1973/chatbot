import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        int i,j;
        Scanner b=new Scanner(System.in);
        System.out.println("Please enter the number for pattern: ");
        int n=b.nextInt();
        for(i=1;i<=n;i++){

            for(j=1;j<=i;j++){
                System.out.print(j*i+" ");
            }
            System.out.println();
        }
    }
}

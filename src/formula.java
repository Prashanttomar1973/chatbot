import java.util.*;
public class formula {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number for verification: ");
        int n=ob.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                float a=i;
                float b=j;
                 float ans=(a*a+b*b+(2*a*b));
                System.out.println(ans);

            }
        }

    }
}

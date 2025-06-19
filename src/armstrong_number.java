import java.util.Scanner;
import java.lang.Math;
public class armstrong_number {
    static boolean isArmstrong(int n){
        int temp,last=0,sum=0,digits=0;
        temp=n;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digits));
            temp=temp/10;
            }
        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        System.out.println("Armstrong number up to"+num+"are:");
        for(int i=0;i<=num;i++){
            if(isArmstrong(i)){
                System.out.print(i+",");
            }
        }
    }


}

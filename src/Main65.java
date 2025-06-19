import java.util.*;
class greatest_num{
    void g_num(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a+" is greatest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest number");
        }

        else{
            System.out.println(c+" is greatest number");
        }


    }
}



public class Main65 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        greatest_num obj=new  greatest_num();
        System.out.println("Enter the three number:");
        int x=sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();

        obj.g_num(x, y, z);
    }
}

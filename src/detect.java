import java.util.Scanner;
 class detect {
     static int Addition(int a,int b){
        int c=a+b;
        return c;
    }

public static void main(String[] args){
        detect obj=new detect();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int a=sc.nextInt();
        System.out.println("Enter the num2:");
        int b=sc.nextInt();

    System.out.println(Addition(a,b));
    }


}

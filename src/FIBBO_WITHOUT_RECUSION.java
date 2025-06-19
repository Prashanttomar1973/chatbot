import java.util.*;

class fibbo{
  static  int n1=0,n2=1,n3=0;
    static void fibbo(int count){
        if(count >0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fibbo(count-1);
        }
    }

    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("Enter the number for printing to 'N' numbers of fibbonacci series!");
        int count=b.nextInt();
        System.out.print(n1+" "+n2);
        fibbo(count-2);
    }
}
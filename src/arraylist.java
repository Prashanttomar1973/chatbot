import java.util.*;
class addition{
    public void add(int n1,int n2){

        Scanner b=new Scanner(System.in);

        if(n1!=0 && n2!=0){
          int ans=n1+n2;
            System.out.println("Addition is"+ans);
           int m=ans;
           if(m!=0)
           {
               System.out.println("Enter number1 for Multiplication: ");
               int n3=b.nextInt();
               System.out.println("Enter number1 for Multiplication: ");
               int n4=b.nextInt();
               System.out.println("Multiplication is"+(n3*n4));
           }
        }


    }
    public static void main(String[] args){
        Scanner b=new Scanner(System.in);

        System.out.println("Enter number1 for addition: ");
        int n1=b.nextInt();
        System.out.println("Enter number1 for addition: ");
        int n2=b.nextInt();

        addition ob=new addition();
        ob.add(n1,n2);
    }
}
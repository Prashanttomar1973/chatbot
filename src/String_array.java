import java.util.*;
public class String_array {
    static void print(String[] name,int n){
        for(int i=0;i<n;i++)
        {
                System.out.print(name[i]+" ");
        }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the  String array:");
       int n=sc.nextInt();
       String[] name=new String[n];
        System.out.println("Enter the names as per required data:");
       for(int i=0;i<n;i++){
           name[i]=sc.next();
       }
        System.out.println("This is named array:");
       print(name,n);

    }
}

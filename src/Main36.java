import java.util.*;
public class Main36 {
    public static void main(String[] args){
     Scanner obj=new Scanner (System.in);
        System.out.println("Enter the array size ");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        int p=0;
        System.out.println("Enter the x");

        int x=obj.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                p+=1;}
        }
        System.out.println(p);


    }
}

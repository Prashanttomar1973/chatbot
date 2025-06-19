import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=obj.nextInt();
        int[] arr45=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr45.length;i++){
            arr45[i]=obj.nextInt();
        }
        System.out.println("Enter the x:");
        int x=obj.nextInt();
        int index=-1;

        for(int i=0;i<arr45.length;i++){
            if(arr45[i]==x){
                index=i;
            }
        }
        System.out.println(index);

    }
}
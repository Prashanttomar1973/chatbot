import java.util.*;
public class main34 {
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the array size");
        int n=obj.nextInt();
        int[]  arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }


        System.out.println("Now the array is");
        for(int i=0;i<arr.length;i++){
            System.out.print (arr[i]+" ");
        }
    }

}

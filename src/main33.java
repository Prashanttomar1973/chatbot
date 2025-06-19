import java.util.*;

class large{
    static int findlarge(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int findMax(int[] arr){
         int mx=findlarge(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
           arr[i]=Integer.MIN_VALUE;
            }
        }
        return findlarge(arr);
    }
}

public class main33{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        large obj=new large();
      int m=obj.findMax(arr1);
        System.out.println("the second largest element is "+m);
    }
}
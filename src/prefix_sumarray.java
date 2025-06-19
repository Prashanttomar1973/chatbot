import java.util.*;

public class prefix_sumarray {
    static void print(int[] arr){
        System.out.println("This is prefix sum array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void presum(int[] arr){
        int n=arr.length;
//        int[] pre=new int[n];
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        print(arr);
    }

public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements in the array:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    presum(arr);
}


}

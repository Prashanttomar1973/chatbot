import java.util.*;
public class sumof_suffix_ofarray {
    static void print(int[] arr,int n){
        System.out.println("Sum of suffix of array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static int[] partition_subarray(int[] arr,int n){
        int[] arr1=new int[n];
//        int[] arr2=new int[n];
     for(int i=n-2;i>=0;i--){
         arr[i]+=arr[i+1];}
        print( arr, n);

    return arr;
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
        partition_subarray( arr, n);
    }
}

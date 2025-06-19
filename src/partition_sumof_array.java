import java.util.*;
public class partition_sumof_array {
    static int totalsum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean partition_sum(int[] arr){
        int sum=totalsum(arr);
        int preffix=0;
        for(int i=0;i<arr.length;i++){
            preffix+=arr[i];
            int suffix= sum-preffix;
            if(suffix==preffix){
                return true;
            }
        }
        return false;
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

        System.out.println("equal partition possible  "+partition_sum( arr));
    }
}

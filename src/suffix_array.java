import java.util.*;
public class suffix_array {
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] suffix(int[] arr){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]+=arr[i+1];
        }
        print(arr);
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         suffix(arr);

    }
}

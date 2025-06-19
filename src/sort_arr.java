import java.util.*;

public class sort_arr {



    static void arr_count(int[] arr,int n){
        int h=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            { h+=1; }
        }
        for(int i=0;i<n;i++){
            if(i<h){
                arr[i] = 0;
            }
            else{
                arr[i]=1;
            }
        }
        for(int i=h;i<n;i++){
            arr[i]=1;
        }
        printarr(arr);
    }

    static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
        System.out.println("now , sorted array :");
        arr_count( arr,n);

    }
}

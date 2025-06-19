import java.util.*;
public class square_of_elementsinarray
{       static void print(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}
    static void reverse12(int[] arr,int n){
        int[] arr3=new int[n];
        for(int i=0;i<arr.length;i++){
        arr3[i]=arr[n-(i+1)];
        }
        print(arr3);
    }
    static void sort_squareofelement(int[] arr,int n)
    {       int l=0;
            int r=n-1;
            int k=0;
            int[] ans=new int[n];
            while(l<=r){
                if(Math.abs(arr[l])>Math.abs(arr[r]) ){
                   ans[k++]=arr[l]*arr[l];
                    l++;
                }
                else{
                    ans[k++]=arr[r]*arr[r];
                    r--;
                }
            }
            reverse12(ans,n);
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
      }
        sort_squareofelement( arr,n);
    }
}

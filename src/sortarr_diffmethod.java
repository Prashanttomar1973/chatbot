import  java.util.*;
public class sortarr_diffmethod {

    static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void swap(int arr[],int l,int r){

        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }

    static void sort(int[] arr,int n){
        int l=0;
        int r=n-1;

        while(l<r){
            // Move left pointer until we find an odd number
            while(l<r && arr[l]%2==0){
                l++;
            }
            // Move right pointer until we find an even number
            while(l<r && arr[r]%2!=0){
                r--;
            }
            // If pointers haven't crossed, swap the elements
            if(l<r){
                swap(arr,l,r);
            }
        }
        printarr(arr);
    }

    public static void main(String[]args){
        sortarr_diffmethod b=new sortarr_diffmethod();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("now sorted array ");
        b.sort(arr, n);
    }




}



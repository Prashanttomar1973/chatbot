import java.util.*;

public class swap_array_withoutUsingother_array {

   static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

   static void swap(int[] arr,int i,int j){

      int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
   }

    static void   reverse_array(int[] arr){
        int i=0,j=arr.length-1;

       while(i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        printarr(arr);
    }

    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }

        reverse_array(arr);
    }
}

import java.util.*;

public class reverse_array {
    static int re_array(int[] arr,int n){
     int[] arr1=new int[n];
     for(int i=0;i<arr.length;i++){
         arr1[i]=arr[arr.length-(i+1)];
         System.out.print(arr1[i]+" ");
     }
  return 0;
    }


    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=obj.nextInt();
         int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        re_array(arr,n);
    }
}

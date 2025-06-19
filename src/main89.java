import java.util.*;

public class main89 {
    static int array24(int[] arr){
       Arrays.sort(arr);
//      for(int i=0;i<arr.length;i++)  {
//            System.out.print(arr[i]+" ");
//        }
      int ans=-1;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }


        return -1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\n"+array24(arr));
    }
}

import java.util.*;
public class sumof_elementin_range {
    static int[] prefix(int[] arr){
        for(int i=1;i<arr.length;i++)
        {
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("Enter the elements in the array:");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int[] prearr= prefix(arr);
        System.out.println("Enter the queries");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter the range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans9=prearr[r]-prearr[l-1];
            System.out.println("the sum is "+ans9);
        }
    }
}

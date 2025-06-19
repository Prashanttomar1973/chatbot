import java.util.*;
public class queries_in_array {
    static int[]  frequency(int[] arr){
        int[] fre_arr=new int[100005];
        for(int i=0;i<arr.length;i++){
            fre_arr[arr[i]]++;
        }
        return fre_arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int[] freq = frequency(arr);
        System.out.println("Enter the numbers for your queries");
        int q = obj.nextInt();
        while (q > 0) {
            System.out.println("Enter number to be searched: ");
            int x = obj.nextInt();
            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }

    }
}

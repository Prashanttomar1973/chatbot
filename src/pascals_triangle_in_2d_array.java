import java.util.Scanner;

public class pascals_triangle_in_2d_array {
    static void print(int[][] arr,int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] Pascals_triangle(int n){
        int[][] arr=new int[n][];
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
             for(int j=1;j<i;j++){
                 arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
             }
        }
        print( arr,n);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Pascal's triangle!");
        int n = sc.nextInt();
        System.out.println("This is Pascal's Triangle:");
        Pascals_triangle(n);
    }
    }

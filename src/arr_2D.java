import java.util.*;
public class arr_2D {
    static void print(int[][] sum){
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sum_twoarr(int[][] arr1,int[][] arr2,int r1,int c1,int r2,int c2){
        int n=arr1.length;
        int[][] sum=new int[r1][c1];
        if(r1!=c2 || r2!=c2){
            System.out.println(" Please enter No. of rows and columns is equals!");
        return;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
            System.out.println();
        }
        print(sum);

    }

    public static void main(String[] args){
     Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix 1:");
        int r1=obj.nextInt();
        System.out.println("Enter the number of columns for matrix 1:");
        int c1=obj.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter the element in the matrix1:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=obj.nextInt();
            }
        }

        System.out.println("Enter the number of rows for matrix 2:");
        int r2=obj.nextInt();
        System.out.println("Enter the number of columns for matrix 2:");
        int c2=obj.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("Enter the elements in the matrix2:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=obj.nextInt();
            }
        }
        sum_twoarr(arr1, arr2, r1,c1, r2, c2);
    }
}

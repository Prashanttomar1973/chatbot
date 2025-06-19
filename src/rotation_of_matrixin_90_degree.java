import java.util.*;

public class rotation_of_matrixin_90_degree {
    static void print(int arr[][],int r){
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void reverse_arr(int[] arr,int r){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static int[][] transpose_array(int[][] arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
             int temp=arr[i][j];
                 arr[i][j]=arr[j][i];
                 arr[j][i]=temp;
            }
        }
        return arr;
    }
    static void rotate(int arr[][],int r,int c){
        transpose_array(arr,r,c);
        for(int i=0;i<r;i++){
            reverse_arr(arr[i], r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number columns:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotate( arr, r, c);
        print(arr,r);
    }
}

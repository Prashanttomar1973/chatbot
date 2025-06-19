import java.util.*;
public class transpose_arr {
    static void transpose(int[][] arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number rows:");
        int r=sc.nextInt();
        System.out.println("Enter the number columns:");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose matrix:");
        transpose(arr, r, c);
    }
}

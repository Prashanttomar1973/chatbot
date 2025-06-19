import java.util.*;
public class reverse_elements_of_the_arr {
    static void print(int[][] arr2,int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void reverse_arr(int[][] arr1,int r1,int c1){
        int[][] arr2=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr2[i][j]=arr1[i][c1-(j+1)];
            }
        }
        print(arr2,r1,c1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c1=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter the elements in the 2D array");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        reverse_arr( arr1, r1, c1);
    }
}

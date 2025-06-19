import java.util.*;
public class multiplication_2d_arr {
    static void print(int[][] mul,int r1,int c2){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
        return;
    }
    static void mul_arr(int[][] m1,int[][] m2,int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("Please enter the valid dimension for matrix multiplication:");
            return;
        }
        int[][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++) {
                    mul[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }
        print(mul,r1,c2);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the rows of matrix1:");
        int r1=sc.nextInt();
        System.out.println("Enter the columns of matrix1");
        int c1=sc.nextInt();
        int[][] m1=new int[r1][c1];
        System.out.println("Enter the elements in the matrix1:");
       for(int i=0;i<r1;i++){
           for(int j=0;j<c1;j++){
               m1[i][j]=sc.nextInt();
           }
       }

        System.out.println("Enter the rows of matrix2:");
        int r2=sc.nextInt();
        System.out.println("Entert the columns of the matrix2:");
        int c2=sc.nextInt();

        int[][] m2=new int[r2][c2];
        System.out.println("Enter the elements in the matrix2:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        mul_arr(m1, m2, r1, c1,r2, c2);
    }
}

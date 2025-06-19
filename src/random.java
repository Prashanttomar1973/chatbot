import java.util.*;
 class PrintSpiral{
    static void printMatrix(int[][] matrix ){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralorder(int[][] matrix,int r,int c){
        int toprow=0,bottomrow=r-1;
        int leftcol=0,rightcol=c-1;
        int totalelement=0;
        while(totalelement<r*c){
            for(int j=leftcol;j<=rightcol && totalelement<r*c;j++){
                System.out.print(matrix[toprow][j]+" ");
            totalelement++;
            }
            toprow++;
            for(int i=toprow;i<=bottomrow && totalelement<r*c;i++ ){
                System.out.print(matrix[i][rightcol]+" ");
                totalelement++;
            }
            rightcol--;
            for(int j=rightcol;j>=leftcol && totalelement<r*c;j--){
                System.out.print(matrix[bottomrow][j]+" ");
                totalelement++;
            }
            bottomrow--;
            for(int i=bottomrow;i>=toprow && totalelement<r*c;i--){
                System.out.print(matrix[i][leftcol]+" ");
                totalelement++;
            }
            leftcol++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int total=r*c;
        System.out.println("Enter"+total+"values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Inputmatrix");
        printMatrix(matrix);
        System.out.println("Spiral order");
        printSpiralorder(matrix,r,c);
    }
}




























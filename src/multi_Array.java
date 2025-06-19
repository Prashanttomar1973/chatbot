import java.util.*;
class arr_2{
     void arr_1() {
    int[][] array = new int[3][2];
    for(int i=0;i<=2;i++){
        for(int j=0;j<=1;j++){
            Scanner obj=new Scanner(System.in);
            array[i][j] =obj.nextInt();
        }
    }

         for(int i=0;i<=2;i++){
             for(int j=0;j<=1;j++){
                 System.out.print(array[i][j]+"  ");
             }
             System.out.println();
         }
}
}
public class multi_Array {
    public static void main(String[] args){
     arr_2 sc=new arr_2();
     sc.arr_1();
    }
}

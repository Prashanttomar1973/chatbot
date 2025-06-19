import java.util.*;
public class pattern1 {
    public static void main(String[] args){
        int i,j;
        Scanner bc=new Scanner(System.in);
        System.out.println("Enter the number for pattern: ");
        int lines=bc.nextInt();
         for(i=1;i<=lines;i++){
             for( j=lines;j>=1;j--){
                 if(j != i){
                     System.out.print(j);
                 }
                 else{
                     System.out.print("*");
                 }
             }
             System.out.println();
         }
    }
}

public class pattern2{
    public static void main(String[] args){
        int i,j;
        int n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=n+5;j++){
               if(i==j){
                   System.out.print("*");
               }
               else if(i+j==10){
                   System.out.print("*");
               }
               else if(j==5){
                   System.out.print("*");
               }
               else{
                   System.out.print("O");
               }
            }
            System.out.println();
        }
    }
}
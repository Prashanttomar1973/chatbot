public class pattern10 {
    public static void main(String[] args){
        int i,j;
        int n=10;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if( i==1 || i==10){
                    System.out.print("1");
                }
                else if(i<10 || i>1){
                    if(j==1 || j==10){
                        System.out.print("1");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

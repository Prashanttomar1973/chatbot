public class pattern15 {
    public static void main(String[] args){
        int i,j;
        int n=3;
        int m=1;
        for(i=0;i<=n;i++){
            for(j=0;j<=i; j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
}

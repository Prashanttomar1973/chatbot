public class pattern13
{
    public static void main(String[] args){
        int r=6;
        int c=1;
        int i,j,k;
        for(i=0;i<r;i++){
            for(j=1;j<r-i;++j){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                if(k==0 || i==0){
                    System.out.print("1 ");
                }
                else{
                    c=c*(i-k+1)/k;
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }
    }
}

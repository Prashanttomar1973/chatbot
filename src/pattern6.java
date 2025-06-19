public class pattern6 {
    public static void main(String[] args){
        int i,j;
        int sp=0;
        int n=4;
        for(i=0;i<n;i++){
            for(j=1;j<=sp;j++)
            {

                System.out.print(" ");

            }

            for(j=1;j<=n;j++){
                if(j<=(n-i)){
                System.out.print(j);
                }
                else{
                    System.out.print("*");
                }
            }

            j--;


            while(j>0){
                 if(j>n-i)
                 {
                     System.out.print("*");
                 }
                 else{
                     System.out.print(j);}
                 j--;
            }
            if((n-i)>9){
                sp+=1;}
                System.out.println();

        }
    }
}
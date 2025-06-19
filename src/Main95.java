import java.util.*;
class array_sum{
    void array(){
        Scanner obj=new Scanner(System.in);
        int[]  arr={1,4,5,6,3 };
        System.out.println("Enter the number for find out the sum");
        int n=obj.nextInt();

        int m=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                for(int k=j+1;k<arr.length;k++) {
                    if (arr[i] + arr[j] +arr[k]== n) {
                        System.out.println(" "+arr[i]+" "+arr[j]+" "+arr[k]);
                        m += 1;
                    }
                }
            }
        }
        System.out.println(m);
    }
}


public class Main95 {
    public static void main(String[] args){
        array_sum obj=new array_sum();
        obj.array();
    }
}

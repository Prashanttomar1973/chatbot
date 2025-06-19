import java.util.*;
public class main87 {
    public static void main(String[] args){
        int[]  arr={1,29,3,42,5};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int[] ans={arr[0],arr[arr.length-1]};
        System.out.println("smallest value is "+ans[0]+"\n"+"largest value is "+ans[1]);
//        System.out.println(ans[1]);
    }
}

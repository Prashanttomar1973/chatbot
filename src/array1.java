import java.util.*;
public class array1 {
    public static void main(String[] args){
        // linear Search
        int[] arr={1,2,3,4,5,6,7,8,4,9};
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int ans=-1;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == x) {
                 ans = i;
//              if element is repeated then break is used
               break;
            }
        }
        System.out.println(ans);
    }
}

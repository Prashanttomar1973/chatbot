import java.util.*;
class arr56{
    void main342(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        int ans=0;
        for(int i=1;i<arr.length;i++) {
            if (arr[i] < arr[i - 1]) {
                ans = -1;
                break;
            }

        }
        if(ans==-1){
            System.out.println("array is not sorted");
        }

        else{
            System.out.println("array is sorted");
        }
    }
}
public class sorted_array {
    public static void main(String[] args){
        arr56 obj=new arr56();
        obj.main342();

    }
}

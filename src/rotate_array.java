import java.util.*;

class rotate_array {
    static void printnums(int[] nums1){
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
    static void swap(int[] nums,int i,int j){

        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
 static void reverse(int[] nums,int i,int j){
      while(i<j){
          swap( nums, i, j);
          i++;
          j--;
      }
    }
    static void rotate(int[] nums,int k){
        rotate_array b=new rotate_array();
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"  A ");
        }
        reverse(nums,n-k,n-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" B ");
        }
        reverse(nums,0,n-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" C ");
        }
    }
    public static void main(String[]  args){
      Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=obj.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            nums[i]=obj.nextInt();
        }
        System.out.println("Enter the number for number of rotation:");
        int k=obj.nextInt();
        rotate( nums, k);
        printnums(nums);
    }
}

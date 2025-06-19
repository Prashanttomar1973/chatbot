class op_array{
   static int mon_array() {
       int[] arr = {1, 2, 3, 4,2, 1, 3};

       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   arr[i]=-1;
                   arr[j]=-1;
               }

           }
       }

        int ans=-1;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
               ans=arr[i];
           }
       }
       System.out.println("The unique element is "+ans);
        return 0;
           }
        }
public class main23 {
    public static void main(String[] args){
        op_array obj=new op_array();
        obj.mon_array();
    }
}

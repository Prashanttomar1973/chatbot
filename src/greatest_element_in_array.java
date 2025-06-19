class array23{
    void arr_max(){
        int[] arr={1,3,5,7,9};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }

        System.out.println("max element is "+ans+"  from {1,3,5,7,9}");

    }
}



public class greatest_element_in_array {
    public static void main(String[] args){
        array23 obj=new array23();
        obj.arr_max();
    }
}

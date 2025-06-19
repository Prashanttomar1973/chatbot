public class new_Array {
    public static void arr_Sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int arr[]={5,7,1,3,2};
        System.out.println("Before sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After sorting:");
        arr_Sort(arr);
    }
}

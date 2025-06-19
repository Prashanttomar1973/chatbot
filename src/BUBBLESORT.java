public class BUBBLESORT {
    public static void bubblesort(int arr[]){
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] arg)
    {
        int arr[]={18,2,12,3,41,1};
        int n=arr.length;
        System.out.println("Array before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubblesort(arr);
        System.out.println("array after sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }

}

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

    }
    public static void main(String[] args){
        int[] arr={12,11,13,5,6};
        System.out.println("Before sorting:");
        printArray(arr);

        insertionSort(arr);
        System.out.println("After sorting:");
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

}

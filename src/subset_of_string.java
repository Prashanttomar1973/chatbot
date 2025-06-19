public class subset_of_string {
    public static void main(String[] args){
        String s="FIND";
        int l=s.length();
        int temp=0;
        String[] arr=new String[l*(l+1)/2];
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                arr[temp]=s.substring(i,j+1);
                temp++;
            }
        }
        System.out.println("The subsets of the strings:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

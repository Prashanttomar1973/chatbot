class array12{
    void array_main(){
        int[] arr32={4,2,4,7,4,9,7,4,0,4};
        int count=0;
        int x=4;
        for(int i=0;i<arr32.length;i++){
            if(arr32[i]==x){
                count+=1;
            }
        }
        System.out.println(x+" is present " + count +" times ");
    }

}
public class main45 {
    public static void main(String[]  args){
        array12 obj=new array12();
        obj.array_main();
    }
}

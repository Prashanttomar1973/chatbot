
class arraypkt{
    void arr_traverse(){
        int[] arr1={1,2,3,4,5,6,7};
       int sum=0;
        for(int i=0;i<=6;i++)
        {   sum+=arr1[i];

        }
        System.out.println(sum );

//        for(int age:arr1){
//            System.out.println(age);
//        }

//    int i=0;
//    while(i<=arr1.length){
//        arr1[i]+=0;
//        System.out.println(arr1[i]);
//        i=i+1;
//    }

    }

}


public class traverse_array {
    public static void main(String[] args){
        arraypkt ob=new arraypkt();
        ob.arr_traverse();
    }
}

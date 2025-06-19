class arrayreference{
    void arr23(){
        int[] array34={2,3,4,5,6};
        System.out.println("arrays before changing");
        for(int i=0;i<array34.length;i++){
            System.out.print(array34[i]+" ");
        }
        System.out.println();
          int[] array35=array34.clone();
        for(int i=0;i<array35.length;i++){
            System.out.print(array35[i]+" ");
        }


        System.out.println("\n"+"arrays after changing");
        array35[0]=9;
        array35[1]=23;
        for(int i=0;i<array34.length;i++){
            System.out.print(array34[i]+" ");
        }
        System.out.println();

        for(int i=0;i<array35.length;i++){
            System.out.print(array35[i]+" ");
        }


    }
}
public class Main90 {
    public static void main(String[] args){
        arrayreference obj=new  arrayreference();
        obj.arr23();
    }
}

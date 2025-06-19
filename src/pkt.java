public class pkt {
   static void mul(int a){
        a+=100;
       System.out.println(a);
    }
    public static void main(String[] args){
        int a=10;
        System.out.println("Before the change"+a);
        mul(a);
        System.out.println("After the change"+a);
    }
}

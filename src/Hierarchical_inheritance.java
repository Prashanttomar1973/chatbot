 class A{
    public int A_method(){
        System.out.println("Hello I am A!");
        return 0;
    }
}
class B extends A{
    public int  B_method(){
        System.out.println("Hello I am brother of A!");
        return 0;
    }
}

class C extends A{
    public int  C_method(){
        System.out.println("Hello I am sister of A!");
        return 0;
    }
}


public class Hierarchical_inheritance {
    public static void main(String[] args){
        C ob=new C();
        System.out.println(ob.A_method());
    }
}

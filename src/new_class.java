import java.util.*;


public class new_class {
    int id;
    String name;
     new_class(int i,String n){
         id=i;
         name=n;
     }
     void display(){
         System.out.println("id "+id+" name "+name);
     }

    public static void main(String[] args){
        new_class op1=new new_class(67,"pop");
        new_class op2=new new_class(68,"rop");
        op1.display();
        op2.display();
    }
}

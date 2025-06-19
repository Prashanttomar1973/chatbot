package pw.skills;
import java.util.*;

public class App {
    String str_1="I am a public member";
    void printFromOutsideClass() {
        System.out.println("within class:"+str_1);
    }
    public static void main(String[] args) {
        App obj=new App();
        obj.printFromOutsideClass();
        System.out.println("within class"+obj.str_1);
     App2 obj2=new App2();
     obj2.printFromOutsideClass();
     }
    }
    class App2{
    void printFromOutsideClass(){
     App obj=new App();
        System.out.println("Within package, outside class:"+obj.str_1);
    }
    }



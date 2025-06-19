import org.w3c.dom.ls.LSOutput;
import pw.skills.App;
public class outsidepwskills {
public static void main(String[] args) {
   App obj = new App();
//    System.out.println("out package,non child classs" + obj.str_1);
    App3 obj3 = new App3();
    obj3.printFromchildclass();
}
}

 class App3 extends App {
     App3 obj3 = new App3();

    void printFromchildclass()
     {
//         System.out.println("child class:" + obj3.str_1);
     }
 }
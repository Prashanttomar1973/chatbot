import java.util.*;
class ThreadTest extends Thread{
    public void run(){
        try {
            System.out.println("Thread"+Thread.currentThread().getId()+"is running");
        }
        catch(Exception e){
            System.out.println("Exeption is caught");
        }
    }
}
public class unique {

    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            ThreadTest object=new ThreadTest();
            object.run();
        }

    }
}

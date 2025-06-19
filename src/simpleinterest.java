import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the Principle:");
        float p=sc.nextFloat();
        System.out.println("Please enter the Rate of Interest:");
        float r=sc.nextFloat();
        System.out.println("Please enter the Time of Interest:");
        float t=sc.nextFloat();
        float si=(p*r*t)/100;
        System.out.println("the simple interest is:"+si);

    }
}

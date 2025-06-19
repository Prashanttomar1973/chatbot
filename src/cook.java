import java.util.*;
public class cook {

    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("""
                          Enter the your food Name numberwise:
                                1.tomatoes
                                2.potatoes
                                3.cabbage
                                4.beans
                                """);
        int fd=ob.nextInt();
        if(fd==1)
        { int n1=0;
            for(int i=1;i<=10;i++) {
                n1++;
                if(n1==1)
                {
                    System.out.println("Your tomatoes are start to cooking!");
                }
                if(n1==2)
                {
                    System.out.println("Your tomatoes cooked half!");
                }
                if(n1==3)
                {
                    System.out.println("Your tomatoes have been cooked completely!");
                }
                if(n1==4)
                {
                    System.out.println("Please take it!");
                }
            }
        }
        if(fd==3)
        { int n1=0;
            for(int i=1;i<=10;i++) {
                n1++;
                if(n1==1)
                {
                    System.out.println("Your cabbage are start to cooking!");
                }
                if(n1==2)
                {
                    System.out.println("Your  cabbage cooked half!");
                }
                if(n1==3)
                {
                    System.out.println("Your  cabbage have been cooked completely!");
                }
                if(n1==4)
                {
                    System.out.println("Please take it!");
                }
            }
        }
        if(fd==4)
        { int n1=0;
            for(int i=1;i<=10;i++) {
                n1++;
                if(n1==1)
                {
                    System.out.println("Your beans are start to cooking!");
                }
                if(n1==2)
                {
                    System.out.println("Your  beans  cooked half!");
                }
                if(n1==3)
                {
                    System.out.println("Your  beans  have been cooked completely!");
                }
                if(n1==4)
                {
                    System.out.println("Please take it!");
                }
            }
        }


    }
}






import java.util.*;
class quiz{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("<----WELCOME TO QUIZ WORLD!---->");
        System.out.println("ENTER THE NUMBER FOR STARTING TO QUIZ!");
        int n=ob.nextInt();
        if(n!=0){
            System.out.println("Enter the question number1: ");
            int n1=ob.nextInt();
            if(n1==1){
                System.out.println("""
                       Q1.Who invented java programming?
                        a)GUIDO Van Rossum
                        b)James Gosling
                        c)Dennis Ritchie
                        d)Bjarne Stroustrup
                        """);
            }
            System.out.println("Enter the question number2: ");
            int n2=ob.nextInt();
      if(n2==2){
                System.out.println("""
                        Q2.Which statement is true about java?
                        a)Java is sequence-dependent programming language
                        b)Java is a code dependent programming language 
                        c)Java is a platform-dependent programming language
                        d)Java is a platform-independent programming language
                        """);
            }
            System.out.println("Enter the question number3: ");
            int n3=ob.nextInt();

            if(n3==3){
                System.out.println("""
                        3.Which component is used to compile,debug and execute the java programs?
                        a)JRE
                        b)JIT
                        c)JDK
                        d)JVM
                        """);
            }
            System.out.println("Enter the question number4: ");
            int n4=ob.nextInt();
            if(n4==4){
                System.out.println("""
                        4.Which of these cannot be used for a variable name  in java?
                        a)Identifier & Keyword
                        b)Identifier
                        c)Keyword
                        d)None of the mentioned
                        """);
            }
            System.out.println("Enter the question number5: ");
            int n5=ob.nextInt();
            if(n5==5){
                System.out.println("""
                        5.Which one of the following is not a java feature?
                        a)Object-oriented
                        b)Use of pointer 
                        c)Portable
                        d)Dynamic and Extensible 
                        """);
            }
        }
        else{
            System.out.println("PLEASE ENTER GREATER THAN ZERO NUMBER!");
        }
    }
}
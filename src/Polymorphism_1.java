class poly{
    int age;
    String name;
    float mark;
    public static void print(String name){
        System.out.println(name);
    }
    public static void print(int age){
        System.out.println(age);
    }
    public static void print(float mark){
        System.out.println(mark);
    }
}

public class Polymorphism_1 {
    public static void main(String[] args){
        poly b=new poly();
     b.name="Prashant";
     b.age=20;
     b.mark=90;
     b.print(b.name);
     b.print(b.age);
     b.print(b.mark);

    }
}

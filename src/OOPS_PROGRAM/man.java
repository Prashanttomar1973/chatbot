package OOPS_PROGRAM;

class Person{
int height;
String name;

String personality_type;

float weight;

String health;

double income;

}

public class man {
    public static void main(String[] args)
    {
        Person b=new Person();
b.name="Prashant";
b.height=170;
b.personality_type="good";
b.weight=70;
b.health="fit";
b.income=1.0;

        System.out.println("name "+b.name);
        System.out.println("height "+b.height);
        System.out.println("personality_type "+b.personality_type);
        System.out.println("weight "+b.weight);
        System.out.println("health "+b.health);
        System.out.println("income "+b.income);
    }
}

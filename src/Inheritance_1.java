class grandfather{
    String Last_name="abcd";
    int houses=10;
    double assets=1000000;
}
class father extends grandfather{
    double assets = 500000000;
}
class child extends father{
    double assets= 1000000000;
}
public class Inheritance_1 {
    public static void main(String[] args){
        child b=new child();
        System.out.println(b.Last_name);
        System.out.println(b.houses);
        System.out.println(b.assets);
    }
}


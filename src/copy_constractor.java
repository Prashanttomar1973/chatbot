class plot{
    int area=9090;
    String address="India";

    double price=100000.0;
    plot(plot s2){
this.address=s2.address;
this.price=s2.price;
    }
    plot(){

    }
}

public class copy_constractor {
    public static void main(String[] args){
        plot s1=new plot();
        System.out.println(s1.address);
        System.out.println(s1.price);
        plot s2=new plot(s1);
        System.out.println(s2.address);
        System.out.println(s2.price);
    }

}

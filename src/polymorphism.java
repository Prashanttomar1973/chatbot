import java.util.*;
class square{
        public int area1( int a){
        System.out.println("area of squrae by integer"+ a*a);
        return 0;}

        public float area2(float a){
            System.out.println("area of square by float"+a*a);
            return 0;
        }
}


class rectangle{
    public int area3(int a,int b){
        System.out.println("area of rectangle by integer"+a*b);
        return 0;
    }

    public float area4(float a,float b){
        System.out.println("area of rectangle by float"+a*b);
        return 0;
    }
}

class circle{
    public int area5(int a){
        System.out.println("area of circle by integer"+Math.PI*a*a);
        return 0;
    }
    public float area6(float a){
        System.out.println("area of circle by float"+Math.PI*a*a);
        return 0;
    }

}


public class polymorphism {
    public static void main(String[] args){
        int a=4;
        int b=9;
        square obj1=new square();
        obj1.area1(4);
        obj1.area2(4);

        rectangle obj2=new rectangle();
        obj2.area3(4,9);
        obj2.area4(4,9);

        circle obj3=new circle();
        obj3.area5(4);
        obj3.area6(4);


    }
}

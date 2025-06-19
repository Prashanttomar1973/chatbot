class country{
    void citizationship(){
        System.out.println("I am person of this country");
    }
}
class state extends country{
    void native_state(){
        System.out.println("I am native of this state");
    }
}
class district extends state{
    void native_district(){
        System.out.println("I am native of this district");
    }
}

public class multilevel_inheritence {
    public static void main(String[] args){
     district obj=new district();
     obj.citizationship();
     obj.native_state();
     obj.native_district();
    }
}

package OOPS_PROGRAM;

 class house{
        String house_name="shantiniketan";

}

class room_1{
    house b1=new house();
    String s1=b1.house_name;

}
class room_2{

     room_1 b2=new room_1();
    String sp3=b2.s1;

}

public class newprogram {

    public static void main(String[] args){
        room_2 b4=new room_2();
        System.out.println(b4.sp3);

    }
}

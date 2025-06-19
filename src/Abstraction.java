abstract class college
{
   public void post_1(){
       System.out.println("Director");
   }
  public void post_2(){
      System.out.println("Dean");
  }
  public static void post_3(){
      System.out.println("HOD");
  }

  public static void post_4()
    {
        System.out.println("faculties");
    }
}
class Director extends college{
    protected void leader(){
        System.out.println("The controllor");
    }
}

class Dean extends college{
    protected void impliment(){
        System.out.println("The ruler");
    }
}
class Hod extends college{
    protected void indicate(){
        System.out.println("The instructor");
    }

}
class faculty extends college{
    protected void follow()
    {
        System.out.println("The follower");
    }
}

public class Abstraction {
    public static void main(String[] args){
        faculty b1=new faculty();
        b1.follow();
        b1.post_4();
        Hod b2=new Hod();
        b2.indicate();
        b2.post_3();

        Dean b3=new Dean();
        b3.impliment();
        b3.post_2();

        Director b4=new Director();
        b4.leader();
        b4.post_1();
    }
}

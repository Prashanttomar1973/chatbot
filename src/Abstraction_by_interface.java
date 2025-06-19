interface human {
    int eye=2;
    int leg =2;
    int hands=2;
    int mouth=1;
    int ear=2;
    void brain();
}

  class men implements human{
public void brain(){
    System.out.println("Brain is provide functionality for body organs!");
}

}

public class Abstraction_by_interface {
    public static void main(String[] args){
    men b=new men();
    b.brain();
        System.out.println("men have "+b.eye+" eyes");
        System.out.println("men have "+b.ear+" ears");
        System.out.println("men have "+b.mouth+" mouth");
        System.out.println("men have "+b.leg+" legs");
        System.out.println("men have "+b.hands+" hands");

    }
}

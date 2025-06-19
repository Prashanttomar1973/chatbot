package OOPS_PROGRAM;

import garages_program.*;
class bag_attri{
    String pocket1="upperpocket";
    String pocket2="secondpocket";

    String pocket3="secondlastpocket";
    String pocket4="lastpocket";
    String pocket5="leftpocket";
    String pocket6="rightpocket";
    String pocket7="laptoppocket";
public static int carry(){
     for(int i=1;i<=7;i++){
         System.out.println("pocket "+i+" is filled by things in complete way.");

     }
    return 0 ;
}

}

public class bag {
    public static void main(String[] args){
        bag_attri b=new bag_attri();
        System.out.println(b.pocket1);
        System.out.println(bag_attri.carry());
        garages_program.Leaner b1=new garages_program.Leaner();
        System.out.println(b1.academy);
    }
}

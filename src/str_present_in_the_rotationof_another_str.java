public class str_present_in_the_rotationof_another_str {
    public static void main(String[] args){
        String s1="abcde";
        String s2="deabc ----------------";
           if(s1.length()!=s2.length()){
               System.out.println(s2+" string is not present of rotation of "+(s1+s1));
           }
           else{
               s1=s1.concat(s1);
            if(s1.indexOf(s2)!= -1){
                System.out.println(s2+" is present in the rotation of the "+s1);
            }
            else{
                System.out.println(s2+" is not present in the rotation of the "+s1);
            }
           }
    }
}

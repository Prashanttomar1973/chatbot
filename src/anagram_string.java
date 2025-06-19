import java.util.*;
public class anagram_string {
    public static void main(String[] args){
        String s1="thisd" +
                "";
        String s2="sithd";
        int l1=s1.length();
        int l2=s2.length();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(l1!=l2) {
            System.out.println("The given string is not anagram string!");
        } else{
            char[] s3=s1.toCharArray();
            char[] s4=s2.toCharArray();

            Arrays.sort(s3);
            Arrays.sort(s4);

             if(Arrays.equals(s3, s4) == true){
                 System.out.println("Both string are anagram:");
             }
             else{
                 System.out.println("Both string are not anagram:");
             }
        }

    }
}
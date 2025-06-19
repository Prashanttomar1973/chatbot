import java.util.*;
public class reverse_string_wordbyword {
public static void main(String[] args){
    String s;
    System.out.println("Enter the string:");
    Scanner b=new Scanner(System.in);
    s=b.nextLine();
    System.out.println("After reverse to string:");
    for(int i=s.length();i>0;--i){
        System.out.print(s.charAt(i-1));
    }
}
}

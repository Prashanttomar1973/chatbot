import java.util.Scanner;
public class Reverse_String_word_by_word {
    public static void main(String[] args){
        String str;
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        sc.close();
        String reversed=reverseString(str);
        System.out.println("The reversed string is:"+reversed);
    }
    public static String reverseString(String s){
        if(s.isEmpty()){
            return s;
        }
  return reverseString(s.substring(1))+s.charAt(0);
    }
}

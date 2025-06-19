import java.util.*;
class Prime_number{
    public static void main(String[] args){
        String original,reverse="";
        Scanner b=new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome!");
        original=b.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("Entered string/number is a palindrome:");
        }
        else{
            System.out.println("Enter string/number is not a palindrome:");
        }

    }
}
import java.util.*;
public class String_to_Integer_conversion {
    public static void main(String[] args){
        String s="123";
        String org_str;
        int convertedInt;
        System.out.println("Performing string to int conversion:");
        try{
            convertedInt=Integer.parseInt(s);
            org_str=s;
            System.out.println("Original string:"+org_str);
            System.out.println("converted int :"+convertedInt);
        }
        catch(NumberFormatException e) {
            System.out.println("Error: Invalid integer format in the string.");
            org_str = "N/A";
            convertedInt = -1;
        }

        if(convertedInt != -1){
            System.out.println("Performint additional operation with the converted int :"+(convertedInt*2));
        }
        else{
            System.out.println(" Unable to perform additional operations due to conversion failure:");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numberic string:");
        String user_Input=sc.nextLine();
        try{
            int userIntValue=Integer.parseInt(user_Input);
            System.out.println("User input convered to int:"+userIntValue);
        }
        catch(NumberFormatException ex){
            System.out.println("Error: Invalid integer format in user input .Default to 0.");
        }
        finally{
            sc.close();
        }
    }
}

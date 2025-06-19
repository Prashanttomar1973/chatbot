public class String_to_Float {
    public static void main(String[] args){
        String floatstring="3.14";
        try{
            Float floatvalue=Float.valueOf(floatstring);

            System.out.println("Converted float value: "+floatvalue);
        }catch(NumberFormatException e){
            System.err.println("Invalid float format: "+floatstring);
            e.printStackTrace();
        }
    }
}

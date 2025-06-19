public class Decimla_To_Binary {

    public static String dec_To_Bin(int decimal){
        StringBuilder binary=new StringBuilder();
        while(decimal>0){
            int remainder=decimal%2;
            binary.insert(0,remainder);
            decimal=decimal/2;
        }
            if(binary.length()==0){
                binary.append("0");
            }
            return binary.toString();

    }
    public static void main(String[] args)
    {
        int decimal=10;
        System.out.println("Binary representation of: "+decimal+" is "+dec_To_Bin(decimal));
    }

}

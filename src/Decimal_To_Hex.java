public class Decimal_To_Hex {
    public static String str_to_hex(int decimal){
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
while(decimal>0){
    rem=decimal%16;
   hex=hexchars[rem]+hex;
   decimal=decimal/16;
}
return hex;
    }
    public static void main(String[] args){
        System.out.println("Hexadecimal of 10 is: "+str_to_hex(10));
        System.out.println("Hexadecimal of 15 is: "+str_to_hex(15));
        System.out.println("Hexadecimal of 289 is: "+str_to_hex(289));
    }
}

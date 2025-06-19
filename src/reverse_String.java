public class reverse_String {
    public static void main(String[] args){
        String s="Dream big";
        String revstr=" ";
        for(int i=s.length()-1;i>=0;i--){
            revstr += s.charAt(i);
        }
        System.out.println("Original string:"+s);
        System.out.println("Reverse string:"+revstr);

    }
}

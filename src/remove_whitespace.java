public class remove_whitespace {
    public static void main(String[] args){
        String s="This is code";
         s=s.replaceAll("\\s+","");
        System.out.println("String after removing all the white spaces:"+s);
    }
}

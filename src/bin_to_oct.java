public class bin_to_oct {
    int binarytodecimal(long binary){
        int decimalnumber =0,i=0;
        while(binary >0){
            decimalnumber+=Math.pow(2,i++)*(binary%10);
            binary/=10;
        }
        return decimalnumber;
    }
    int decimaltooctal(long binary)
    {
        int decimalnumber= binarytodecimal(binary);
        String octalString=Integer.toOctalString(decimalnumber);
        int  octalnumber=Integer.parseInt(octalString);
        return octalnumber;
    }
    public static void main(String[] args){
        bin_to_oct b=new bin_to_oct();
        System.out.println("octal number "+b.decimaltooctal(100110));
    }
}

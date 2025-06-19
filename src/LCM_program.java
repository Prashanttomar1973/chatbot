public class LCM_program {
    public static void main(String[] args){
        int a=15,b=25;
        int c=(a>b)?a:b;
        while(true){
            if(c%a==0 && c%b==0){
                break;
            }
            c++;
        }

        System.out.println("LCM of "+a+" and "+b+" is "+c);
    }
}

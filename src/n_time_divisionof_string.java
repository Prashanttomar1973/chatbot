import java.util.*;
public class n_time_divisionof_string {
    public static void main(String[] args){
        Scanner b=new Scanner(System.in);
        String s="this is a program of string.";
        System.out.println("Enter the number for division of string:");
        int n=b.nextInt();
        int l=s.length();
        int d=l/n;
        int temp=0;
        String[] equalstr=new String[n];
        if(l%n!=0){
                    System.out.println("String can not divided into "+n+"parts");
        }
        else{
            for(int i=0;i<l;i+=d){
                String part=s.substring(i,i+d);
                equalstr[temp]=part;
                temp++;
                }
            int n2=0;
            System.out.println(n+" equal parts of given strig are;");
            for(int  i=0;i<equalstr.length;i++){
                n2++;
                System.out.print(n2+" "+equalstr[i]+"||" +
                        " ");
            }
        }

    }

}

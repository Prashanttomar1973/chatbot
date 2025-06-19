

public class countVowelsConsonants {
    public static void main(String[] args){
        String str="This is my coun.";
        str=str.toLowerCase();
        int countV=0;
        int countC=0;
        int l=str.length();
        for(int i=0;i<l;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                countV++;
            }
            else if(str.charAt(i) >='a' && str.charAt(i)<='z'){
                countC++;
            }
        }

        System.out.println("The number of vowels is "+countV);
        System.out.println("The number of consonants is "+countC);
    }
}

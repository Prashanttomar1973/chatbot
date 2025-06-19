public class count_punctuation {
public static void main(String[] args){
    char[] a={};
    String str="this is ? and ! , :";
    int count= 0;
    int l=str.length();
    for(int i=0;i<l;i++){
        if(str.charAt(i)=='.' || str.charAt(i) == ':' || str.charAt(i) ==';' || str.charAt(i) =='?' || str.charAt(i) =='!' || str.charAt(i)== ',' ){
            count++;
        }
    }
    System.out.println("The total number of punctuation characters in the given string "+count);


}
}

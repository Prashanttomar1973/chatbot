public class DuplicateCharacters {
    public static void main(String[] args){
        String s1="mrm";
        int count;
        char string[]=s1.toCharArray();
        System.out.println("Duplicate characters in a given string:");
        for(int i=0;i<string.length;i++){
            count=1;
            for(int j=i+1;j<string.length;j++){
                if(string[i]==string[j] && string[i] !=' '){
                    count++;
                    string[j]='0';
                }
            }
            if(count>1 && string[i] !='0'){
                System.out.print(string[i]);
            }
        }
    }
}

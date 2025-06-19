public class duplicates_words_in_the_String {
    public static void main(String[] args){
        String s="As Jake walked through the old library, the scent of aged paper filled the air, " +
                "and the wooden floor creaked beneath his steps. He wasn’t looking for any book in particular," +
                " but something about the dimly lit corner shelf caught his attention. A dusty, leather-bound journal rested there.";
        int count;
        s=s.toLowerCase();
        String[] words=s.split(" ");
        System.out.println("Duplicate words in the string:");
        for(int i=0;i<words.length;i++){
            count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if(count>1 && words[i]!="0"){
                System.out.print(words[i]+" ");
            }
        }
    }
}

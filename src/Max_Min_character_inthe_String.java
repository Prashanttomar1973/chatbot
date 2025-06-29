public class Max_Min_character_inthe_String {
    public static void main(String[] args){
        String s="grass is greener on the other side";
        int[] freq=new int[s.length()];
        char minChar=s.charAt(0),maxChar=s.charAt(0);
        int i,j,min,max;

        char string[]=s.toCharArray();
        for(i=0;i<string.length;i++){
            freq[i]=1;
            for(j=i+1;j<string.length;j++){
                if(string[i]==string[j] && string[i] != ' '&& string[i] != '0'){
                    freq[i]++;
                    string[j]='0';
                }
            }
        }
        min=max=freq[0];
        for(i=0;i<freq.length;i++){
            if(min>freq[i] && freq[i]!='0'){
                min=freq[i];
                minChar=string[i];
            }

            if(max<freq[i]){
                max=freq[i];
                maxChar=string[i];
            }
        }
        System.out.println("Minimum occurring character:"+minChar);
        System.out.println("Maximum occurring character:"+maxChar);

    }
}

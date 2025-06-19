//public class Empty{
//    public static boolean arrayStringsAreEqual(String[] word1,String[] word2){
//        int num=0;
//        String str1="";
//        String str2="";
//        if(word1.length!=word2.length){
//            return false;
//        }
//        for(int i=0;i<word1.length;i++){
//            str1+=word1[i];
//            str2+=word2[i];
//        }
//        if(str1.length()!=str2.length()){
//            return false;
//        }
//        for(int j=0;j<str1.length();j++){
//            if(str1.charAt(j)==str2.charAt(j)){
//                num=1;
//            }
//            else{
//                num=0;
//            }
//        }
//        if(num==1){
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args){
//        String[] m1={"a", "cb"};
//        String[] m2={"ab", "c"};
//        System.out.println(arrayStringsAreEqual(m1,m2));
//    }
//}
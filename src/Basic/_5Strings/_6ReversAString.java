package Basic._5Strings;

public class _6ReversAString {
    public static String  ReversStr( String str ){
 String  reversStr=" ";
//        for (int i = str.length()-1; i >=0 ; i--) {
//            reversStr=reversStr+str.charAt(i);
//
//        }


        //method 2
        for (int i = 0; i <=str.length()-1 ; i++) {
            reversStr= str.charAt(i)+reversStr;

        }
        return reversStr;
    }
    public static void main(String[] args) {
 String str = "abcde";
     String ReversString = ReversStr(str);
        System.out.println(ReversString);
    }
}

package Basic.Strings;

public class _1Strings {
    public static void main(String[] args) {
        String str  = "coding ";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        String str1 = "ninjas";
        System.out.println(str + str1);
         String str2 = str + str1;
        System.out.println(str2);

        String strc=str.concat(str1);
        System.out.println(strc);
    }
}

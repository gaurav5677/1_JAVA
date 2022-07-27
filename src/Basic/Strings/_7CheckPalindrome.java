package Basic.Strings;

public class _7CheckPalindrome {
    public static void main(String[] args) {

        String str = "abcdcba";
        System.out.println(Palin(str));
    }

    public static boolean Palin(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) == s.charAt(j)) {
                return true;

            }
        }
        return false;
    }
}

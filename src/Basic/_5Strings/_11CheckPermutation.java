package Basic._5Strings;

public class _11CheckPermutation {
    public static void main(String[] args) {
        String s1 = "stingr";
        String s2 = "string";
        System.out.println(CheckPer(s1, s2));
    }

    public static boolean CheckPer(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        int fre[] = new int[256];
        for (int i = 0; i < 256; i++) {
            fre[i] = 0;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            ++fre[ch];

        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            --fre[ch];
        }

        for (int i = 0; i < 256; i++) {
            if (fre[i] != 0) {
                return false;
            }
        }
        return true;

    }
}
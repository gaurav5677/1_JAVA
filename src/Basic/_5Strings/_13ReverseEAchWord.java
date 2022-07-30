package Basic._5Strings;

public class _13ReverseEAchWord {
    public static void main(String[] args) {


        String str ="always drink 3L water ";

        System.out.println(ReversEachW(str));
    }

    public static String reverseword(String str ,int start,int end) {
        String reverse = " ";

        while (start < end) {
            reverse = str.charAt(start) + reverse;
            ++start;
        }
        return reverse;
    }


    public static String ReversEachW(String s) {
        int n = s.length();
        int previousSpaceIndex = -1;
        String Ans = " ";
        int i = 0;
        for (; i < n; i++) {
            if (s.charAt(i) == ' ') {
                Ans += (reverseword(s, previousSpaceIndex + 1, i) + " ");
                previousSpaceIndex = i;
            }
        }
        Ans += (reverseword(s, previousSpaceIndex + 1, i) + " ");
        return Ans;

    }
}

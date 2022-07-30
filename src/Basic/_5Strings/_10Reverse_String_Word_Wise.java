package Basic._5Strings;

public class _10Reverse_String_Word_Wise {
    public static void main(String[] args) {
        String str = "hey there a and then ";
        System.out.println(ReversString(str));
    }

    public static String ReversString(String a) {
        int end = a.length();
        int i = a.length() - 1;
        String ans = " ";
        while (i >= 0) {
            if (a.charAt(i) == ' ') {
                ans = ans + a.substring(i + 1, end) + " ";
                end = i;
            }
            i--;

        }
        ans = ans + a.substring(i + 1, end);
        return ans;


    }
}


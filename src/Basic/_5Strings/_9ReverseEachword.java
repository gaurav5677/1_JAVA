package Basic._5Strings;


public class _9ReverseEachword {
    public static void main(String[] args) {
        String str = "abc def ghi jkl";
        System.out.println(ReverseEachW(str));
    }

    public static String ReverseEachW(String a) {
        String ans = " ";

        int CWStart = 0;
        int i;
        for (i = 0; i < a.length(); i++) {

            if (a.charAt(i) == ' ') {
                // Reverse Each word
                int CWend = i - 1;
                String RW = " ";
                for (int j = CWStart; j <= CWend; j++) {
                    RW = a.charAt(j) + RW;
                }
                //Add if find string
                ans += RW + " ";
                CWStart = i + 1;
            }

        }

        //Reverse the  last world
        // Reverse Each word
        int CWend = i - 1;
        String RW = " ";
        for (int j = CWStart; j <= CWend; j++) {
            RW = a.charAt(j) + RW;
        }
        //Add if find string
        ans += RW;


        return ans;
    }
}


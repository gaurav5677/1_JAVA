package Basic._5Strings;


public class _9ReverseEachword {
    public static void main(String[] args) {
        String str = "abc deg ghi";
        System.out.println(ReversEach(str));
    }

    public static String ReversEach(String str) {
        String news = " ";
        int Counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                //revers Current word
                int CouterEnd = i - 1;
                String revers = " ";
                for (int j = Counter; j <= CouterEnd; j++) {

                    news = str.charAt(j) + revers;

                    // add it  final string(news)


                }
                news = news + revers + " ";
                Counter=i+1;
            }


        }            return news;

    }
}


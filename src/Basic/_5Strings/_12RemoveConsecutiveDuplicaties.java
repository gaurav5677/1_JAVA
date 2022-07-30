package Basic._5Strings;


public class _12RemoveConsecutiveDuplicaties {
    public static void main(String[] args) {
        String str = "aadddvvvfffsssvvvffgggss";
        System.out.println(RemoveConsecu(str));
    }

    public static String RemoveConsecu(String str) {

        int n = str.length();
        if (n == 0) {
            return str;
        }
        String ans = " ";
//using while loop
        //        int i = 0;
//        while (i < n) {
//            char uniqueChar = str.charAt(i);
//            int j = i + 1;
//            while (j < n && str.charAt(j) == uniqueChar) {
//                j += 1;
//            }
//            ans += uniqueChar;
//            i = j;
//
//        }
        // solved using for loop
        for (int i = 0; i < n; i++) {
            char UniqueChar = str.charAt(i);
            for (int j = i + 1; j < n && str.charAt(j) == UniqueChar; j = j + 1) {

                i = j;


            }
            ans = ans + UniqueChar;

        }


        return ans;
    }


}


package Basic.Strings;

import java.util.Scanner;

public class _3StrringInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str + "  " + str.length());
        String str2 = s.nextLine();
        System.out.println(str2+ " " + str2.length());

    }
}

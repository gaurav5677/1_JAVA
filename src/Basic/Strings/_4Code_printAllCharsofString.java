package Basic.Strings;

import java.util.Scanner;

public class _4Code_printAllCharsofString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str =s .nextLine();
      for( int i = 0 ; i<str.length();i++){
          System.out.print(str.charAt(i));
      }
    }
}

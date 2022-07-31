package Basic._5Strings;

import java.util.Scanner;

public class _14RemoveCharacter {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        char x =s.next().charAt(0);
        String str ="aabccbba";

        for (int i = 0; i <=str.length()-1 ; i++) {
            if(str.charAt(i)==x){
                i++;
            }else{
                System.out.print(str.charAt(i));
            }
        }
    }
}

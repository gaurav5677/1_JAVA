package Basic._1SimpleOne;

import java.util.Scanner;

public class SumOFEven_odd_digit_in_N {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int SumE = 0, SumO = 0;
        for (; x > 0; x = x / 10) {
            int lastd = x % 10;
            if (lastd % 2 == 0) {
                SumE = SumE + lastd;
            } else {
                SumO = SumO + lastd;
            }

        }
        System.out.println(SumE + " " + SumO);

    }
}

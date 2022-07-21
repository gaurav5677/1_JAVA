package Basic._1SimpleOne;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, x;
        x= s.nextInt();
        n= s.nextInt();
        int ans = 1;
        for( ;n>0;n--){
            ans = ans*x;

        }
        System.out.println(ans);




    }
}

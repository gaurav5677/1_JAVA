package Basic;

import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S, E, W;
        S = s.nextInt();
        E = s.nextInt();
        W = s.nextInt();
        for ( ; S <= E; S = S + W) {
           double C = (S-32 )*5/9;
            System.out.println(S + " " + C );
        }
    }

}

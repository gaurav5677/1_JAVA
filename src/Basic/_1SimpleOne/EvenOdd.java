package Basic._1SimpleOne;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        if( x %2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
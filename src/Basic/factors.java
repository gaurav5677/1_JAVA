package Basic;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for( int i = 2 ; i<=n/2;i++){
            if( n %i == 0 ){
                System.out.println(i);
            }
        }
    }
}

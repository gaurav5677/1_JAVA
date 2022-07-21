package Basic._3Array;

import java.util.Scanner;

public class TripleSum {
    static Scanner s = new Scanner(System.in);

    public static int[] TakeInput() {
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }

        return input;
    }
    public static int TripleS( int[] input,int x){
        int count =0;
        for (int i = 0; i < input.length ; i++) {
            for (int j = i+1; j < input.length ; j++) {
                for (int k = j+1; k < input.length ; k++) {
                    if (input[i]+input[j]+input[k]==x) {
                     count++;


                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = TakeInput();
        System.out.println("Enter the Number");
        int x = s.nextInt();
        System.out.println(TripleS(arr,x));
    }

}

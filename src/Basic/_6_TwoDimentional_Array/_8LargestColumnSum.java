package Basic._6_TwoDimentional_Array;

import java.util.Scanner;

public class _8LargestColumnSum {
    public static void main(String[] args) {
        int[][] a = TakeInput();
        System.out.println( compare(a) );
    }


    public static int[][] TakeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows  ");
        int rows = s.nextInt();
        System.out.println("Enter the number of cols ");
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the element at " + i+ "row"+j+"column");
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int compare(int[][] a) {
        int rows = a.length;
        int lar = Integer.MIN_VALUE;
        int cols = a[0].length;
        // we want to find the largest column sum , so for this we need to take col first.
        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += a[i][j];// addtion
            }
                if (sum > lar) {
                    lar = sum;//there the lar will change to sum which contains the largest value till now .
                }
            }

        return lar;
    }
}

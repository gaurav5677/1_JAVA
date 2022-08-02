package Basic._6_TwoDimentional_Array;

import java.util.Scanner;

public class _7ColumnWiseSum {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        Sum(arr);

    }

    public static int[][] takeInput() {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int rows = s.nextInt();
        System.out.println(" Enter the number of cols");
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }

        }
        return arr;
    }


    public static void Sum(int[][]a){
        int rows = a.length;

        int cols = a[0].length;
        for (int i =0 ;i<cols;i++) {
            int sum = 0;

            for (int j = 0; j <rows; j++) {
                sum+=a[i][j];


            }

        }
    }
}

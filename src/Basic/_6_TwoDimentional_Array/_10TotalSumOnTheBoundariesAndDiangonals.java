package Basic._6_TwoDimentional_Array;

import java.util.Scanner;

public class _10TotalSumOnTheBoundariesAndDiangonals {
    public static void main(String[] args) {
        int[][] arr = TakeInput();
        totalSum(arr);

    }

    public static int[][] TakeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of Rows");
        int row = s.nextInt();
        System.out.println("enter the number of cols ");
        int cols = s.nextInt();
        int[][] arr = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("enter the element at" + i + "th &" + j + "th position");
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static void totalSum(int[][] a) {
        int n = a.length;
        if (n == 0) {
            System.out.println(0);
            return;
        }
      int totalSum = getFirstDiagonal(a, n);
        //+ getSecDia(a, n) + getbound(a, n);
        if (n % 2 != 0) {
            totalSum -= a[n / 2][n / 2];
        }
        System.out.println(totalSum);
    }

 public static int getFirstDiagonal(int[][] a,int dimention){
        int currRow=0;
        int currenCol =0;

        int diSum=0;
        while( currenCol==currenCol){
            diSum+=a[currRow][currenCol];
            currRow+=1;
            currenCol+=1;
        }
        return diSum;
 }
}


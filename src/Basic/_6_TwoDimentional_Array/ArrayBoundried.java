package Basic._6_TwoDimentional_Array;

import java.util.Scanner;

public class ArrayBoundried {

        public static void main(String[] args) {
            int[][] arr = TakeInput();
            System.out.println(totalSum(arr));

        }

        public static int[][] TakeInput() {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the number of Rows");
            int row = s.nextInt();
            System.out.println("enter the number of cols ");
//            int cols = s.nextInt();
            int[][] arr = new int[row][row];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    System.out.println("enter the element at" + i + "th &" + j + "th position");
                    arr[i][j] = s.nextInt();
                }
            }
            return arr;

        }


        public static int totalSum(int [][]a ){
            int sum=0 ;
            int n=a.length;
            for( int i =1 ;i<=n-1;i++) {
                for (int j = 1; j <=n-1; j++) {
                    if (i == 1 || j == 1 || i == n-1 || j == n-1) {
                        sum += a[i][j];
                    } else {
                        j++;
                    }

                }
                System.out.println();
            }
        return sum;
    }
}

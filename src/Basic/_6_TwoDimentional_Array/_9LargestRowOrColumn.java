package Basic._6_TwoDimentional_Array;

import java.util.Scanner;

public class _9LargestRowOrColumn {
    //    For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the
//    largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
    public static void main(String[] args) {
        int[][] arr = TakeInput();
        largesRoCol(arr);
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

    public static void largesRoCol(int[][] a) {
        boolean isRow = true;
        int larSum=Integer.MIN_VALUE;
        int num=0;

        int  nRow=a.length;
        if( nRow==0){
            System.out.println("row"+ num+" "+larSum );
        }
        int mcols=a[0].length;

        for( int i =0 ; i< nRow;i++){
            int rowSum=0;
            for (int j = 0; j <mcols ; j++) {
                rowSum+=a[i][j];

            }
              if (rowSum>larSum){
                  larSum = rowSum;
                  num = i ;
              }
        }

        for (int j = 0; j <mcols ; j++) {
            int colSum = 0;
            for (int i = 0; i <nRow ; i++) {
                colSum+=a[i][j];
            }
            if (colSum > larSum) {

                larSum=colSum;
                num= j;
                isRow =false;
            }
        }

        if( isRow){
            System.out.println("row :"+num+" "+ larSum);
        }else{
            System.out.println("colums :"+num+" "+larSum);
        }
//        int row = a.length;
//        int cols = a[0].length;
//
//
//
//
//
//        // firnding  Largest values only for rows
//        int rowlar = Integer.MIN_VALUE;
//        if(a.length==0){
//            System.out.println("row "+rowlar);
//        }
//        for (int  i = 0; i < row; i++) {
//            int sum = 0;
//            for (int j = 0; j < cols; j++) {
//                sum = a[i][j];
//            }
//            if (sum > rowlar) {
//                rowlar = sum;
//
//            }
//        }
//
//
//
//
//
//
//
//        // firnding  Largest values only for rows
//
//        int collar = Integer.MIN_VALUE;
//        if(a[0].length==0){
//            System.out.println("col "+ collar);
//        }
//        for (int j = 0; j < cols; j++) {
//            int sum = 0;
//            for (int i = 0; i < row; i++ ) {
//                sum = a[i][j];
//            }
//            if (sum > collar) {
//                collar = sum;
//
//            }
//
//
//        }
//
//        if(rowlar>collar){
//            System.out.println("row "+rowlar );
//
//        }else if(rowlar<collar){
//            System.out.println("col "+ collar);
//        }
//        }
//
//
//
//
//
//    }

    }
}

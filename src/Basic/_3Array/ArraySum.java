package Basic._3Array;

import java.util.Scanner;

public class ArraySum {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + i + "ith position: ");
            arr[i] = s.nextInt();

        }
        return arr;

    }

    public static void arraysum(int[]arr) {
        int total = 0 ;
        for ( int i = 0 ;i< arr.length;i++){
             total = total+arr[i];
        }
        System.out.println(total);
    }

//    public static void output(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        arraysum(arr);

    }
}

package Basic._4Array2SearchingAlgo;

import java.util.Scanner;

public class _5MergeSortedArray {

    public static int[] mergeTwoSortedArray(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
                k++;

            } else {
                res[k] = b[j];
                j++;
                k++;
            }

            while (i < a.length) {
                res[k] = a[i];
                i++;
                k++;
            }
            while (j < b.length) {
                res[k] = b[i];
                j++;
                k++;
            }

        }
        return res;
    }


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int m = s.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArray(a, b);
        print(mergedArray);
    }

}

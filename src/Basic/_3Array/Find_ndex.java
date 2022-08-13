package Basic._3Array;

import java.util.Arrays;

public class Find_ndex {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5};
        int x = 5;
        System.out.println(Arrays.toString(find(arr, 5)));
    }

    public static int[] find(int[] a, int key) {
        {
            //code here.
            int arr[] = {-1, -1};
            for (int i = 0; i < a.length; i++) {
                if (a[i] == key) {
                    arr[0] = i;
                    break;
                }
            }
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[i] == key) {
                    arr[1] = i;
                    break;
                }

            }

            return arr;
        }
    }
}

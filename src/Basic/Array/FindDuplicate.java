package Basic.Array;

import java.util.Scanner;

public class FindDuplicate {
    public static int[] TakeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at" + i + "th position");
            arr[i] = s.nextInt();
        }
        return arr;
    }


    public static void findDuplicate(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                    }
                }


            }

        }
    }
    public static void main(String[] args) {
        int[] arr = TakeInput();
        findDuplicate(arr);
    }
}


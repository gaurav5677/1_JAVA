package Basic._4Array2SearchingAlgo;

public class _7RotateAnArray {


    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 11, 12, 17};
        int x = 5;
        Rotate(arr, x);
        printArray(arr);

    }


    public static void Reverse(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }

    public static void Rotate(int[] arr, int k) {

        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
            // part 1
            Reverse(arr, 0, arr.length - k - 1);
            // here the first part of the array will rotate
            //part 2
            Reverse(arr, arr.length - k, arr.length - k - 1);
            // here the second part of the array will Rotate
            /// all
            Reverse(arr, 0, arr.length - 1);



    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}




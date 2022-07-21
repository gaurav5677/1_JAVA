package Basic._4Array2SearchingAlgo;

public class _2Selection_Sort {
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void SelecSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            //in each round we have to put the element in ith position
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < arr.length; j++) {
                //finding the minimum element among the j positions
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
//         swap minimum element with ith position
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 8, 9, 3, 23};
        SelecSort(arr);// array reference in  main
        // Every Sorting algo will  have type void because  its taks is to sort array only.
        printArray(arr);
    }
}

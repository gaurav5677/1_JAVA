package Basic._4Array2SearchingAlgo;

public class _10Sort01And2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 0, 1, 2, 0};
        sort(arr);
        printArr(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void sort(int[] arr) {
        int nZ = 0, nT = arr.length-1;

        for (int i = 0; i <=nT; ) {
            if (arr[i] == 0) {
                swap(arr, nZ, i);
                nZ++;
            } else if (arr[i] == 2) {
                swap(arr, nT, i);
                nT--;
            } else {
                i++;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}

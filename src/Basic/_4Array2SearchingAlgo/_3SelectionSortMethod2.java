package Basic._4Array2SearchingAlgo;




public class _3SelectionSortMethod2 {

    public static void main(String[] args) {
        int[] arr = {9, 5, 4, 0, 3, 1, 2};
        SelectionSo(arr);
printArray(arr);
    }


    public static void SelectionSo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (isSmaller(arr, j, min)) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    //  Used for swapping ith and jth element of array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //return true if ith element is smaller than jth element ;
    public static boolean isSmaller(int[] arr, int i, int j) {
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }



}

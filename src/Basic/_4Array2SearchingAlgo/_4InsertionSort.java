package Basic._4Array2SearchingAlgo;

public class _4InsertionSort {
    public static void main(String[] args) {

        int[] arr = {9, 5, 4, 0, 3, 1, 2};
        InserS(arr);
        printArray(arr);
    }

    public static void InserS(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            for( int j = i-1;j>=0;j--){
                if( isGreater(arr,j,j+ 1)){
                    swap(arr,j,j+1);
                    }else{
                     break;
                }

            }
        }
    }
    public static void printArray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //  Used for swapping ith and jth element of array
    public static void swap ( int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //return true if ith element is smaller than jth element ;
    public static boolean isGreater ( int[] arr, int j, int i){
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }
}

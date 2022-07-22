package Basic._4Array2SearchingAlgo;

public class _3BubbleSort {
    public static void main(String[] args) {

        int[] arr = {9, 5, 4, 0, 3, 1, 2};
        BubbleS(arr);
        printArray(arr);
    }

    public static void BubbleS(int[] arr){
        for (int itr = 1; itr <= arr.length-1 ; itr++) {
            for (int j = 0; j < arr.length-itr ; j++) {
                if( isSmaller(arr,j+1,j)){
                    swap(arr,j+1,j);
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
        public static boolean isSmaller ( int[] arr, int i, int j){
            if (arr[i] < arr[j]) {
                return true;
            } else {
                return false;
            }
        }
    }
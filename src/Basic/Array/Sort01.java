package Basic.Array;



import java.util.Scanner;

public class Sort01 {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SortZerosAndOne(int[] arr) {
        int z = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0) {
                int temp = arr[z];
                arr[z] = arr[i];
                arr[i] = temp;
                z+=1;

            }
        }


    }
//    public  static void printArray(int[]arr){
//    int n = arr.length;
//        for( int i = 0 ;i<n;i++){
//            System.out.println(arr[i]);
//    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        SortZerosAndOne(arr);
        printArray(arr);
    }


}

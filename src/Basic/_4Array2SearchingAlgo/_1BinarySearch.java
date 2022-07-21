package Basic._4Array2SearchingAlgo;


import java.util.Scanner;

public class _1BinarySearch {
    static Scanner s = new Scanner(System.in);

    public static int BinaryS(int[] arr) {
        System.out.println("Enter the Search Number: ");
        int x = s.nextInt();

        int start =0;
        int end=arr.length-1;

        while(start <= end ){
          int   mid = (start+ end) /2;

            if(arr[mid]>x){
                end = mid-1;

            } else if (arr[mid]<x) {
                start = mid+1;

            }else{
                return mid;
            }
        }
return  -1;
    }

    public static int[] TakeInput() {
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at" + i + "th position");
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {

        int[] arr = TakeInput();
        System.out.println(BinaryS(arr));
    }
}


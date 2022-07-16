package Array;

import java.util.Scanner;

public class LinearSearch {
    public static int[] TakeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];

        for( int i = 0 ; i<n;i++){
            System.out.println("Enter the elementat " + i + "ith position");
            arr[i]=s.nextInt();
    }
        return arr;
    }


    public static int LinearS(int[] arr){
        Scanner s = new Scanner( System.in);
        System.out.println("Enter the number you want to search ");
        int x = s.nextInt();
        for( int i = 1 ;i<arr.length;i++){
            if( arr[i] == x){
              return i ;
            }
        }
 return  -1;
    }


    public static void main(String[] args) {
          int [] arr = TakeInput();
        System.out.println(LinearS(arr));
    }
}

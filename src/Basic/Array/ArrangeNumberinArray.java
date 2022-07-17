package Basic.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumberinArray {

    public static void  main(String[] args) {
        int [] arr=ArrN();
        System.out.println(Arrays.toString(arr));
    }









    public static int[] ArrN() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int start=0,end=n-1;
        int val = 1 ;
       while (start<=end){
           if(val % 2 == 0 ){
               arr[end]=val;
               val++;
               end--;

           }else{
               arr[start]=val;
               start++;
               val++;
           }

       }
        return arr;

    }
}
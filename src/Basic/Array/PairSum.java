package Basic.Array;
//You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
//Note:
//Given array/list can contain duplicate elements.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the first array/list.
//
//Second line contains 'N' single space separated integers representing the elements in the array/list.
//Sample Input 2 :
//2
//9
//1 3 6 2 5 4 3 2 4
//12
//6
//2 8 10 5 -2 5
//10
//Sample Output 2:
//0
//2

import java.util.Scanner;

public class PairSum {
    static Scanner s=new Scanner(System.in);

    public static int  pairS(int[] input,int x) {

        int count = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == x) {
                    count++;
                }

            }

        }
        return count;
    }


    public static int[] TakeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();

        }
        return input;
    }

    public static void main(String[] args) {
        int[] arr = TakeInput();
        System.out.println("Enter the Sum Amount : ");
        int x=s.nextInt();
        System.out.println(pairS(arr,x));
    }


}

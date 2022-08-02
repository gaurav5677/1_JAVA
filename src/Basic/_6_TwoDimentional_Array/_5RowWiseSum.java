package Basic._6_TwoDimentional_Array;
import java.util.Scanner;
public class _5RowWiseSum {
    public static void main(String[] args) {
     int [][]  arr= takeInput();
        sum(arr);
     }
   public static int [][] takeInput(){
        Scanner s = new Scanner(System.in);
       System.out.println("enter the number of rows ");
        int rows = s.nextInt();
       System.out.println(" wnter the number of cols ");
       int cols = s.nextInt();
       int [][] a = new int[rows][cols];


       for( int i = 0 ; i< rows ; i++){
           for( int j = 0 ; j < cols;j++){
               a [i][j]=s.nextInt();

           }
       }
       return a;
   }
   public static void sum( int [][]a){

        int rows=a.length;

        int cols=a[0].length;
       for ( int i = 0 ;i<rows;i++){
           int sum=0;
           for( int j = 0 ;j<cols;j++){
               sum += a[i][j];
           }
           System.out.println(sum);
       }


   }
}

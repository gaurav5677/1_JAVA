package Basic._3Array;

public class SecondLargest {
    int print2largest(int arr[], int n) {
        // code here
        int largest = Integer.MIN_VALUE;
        int SecLar=Integer.MIN_VALUE;
        for( int i = 0 ; i<=arr.length-1;i++){
            if( arr[i]>=largest){
                SecLar = largest;
                largest = arr[i];
            }  else if (secLar < arr[i] && arr[i] != largest) {
                secLar = arr[i];
            }
        }



        return SecLar;

    }



}




}

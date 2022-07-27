package Basic._4Array2SearchingAlgo;

public class _8SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 8, 9, 7};
        int x = Secondlar(arr);
        System.out.println(x);

    }

    //    public static int secondLargestElement(int[] arr){
//        if ( arr.length == 0 ){// edge cases
//            return Integer.MIN_VALUE;
//        }
//        int largest = arr[0] ,secondLargest = Integer.MIN_VALUE;//here we assume the first element is the largest and the sec lar is -infinity .
//        for( int i  = 0 ; i <arr.length-1;i++){
//            if( largest<arr[i]) {// here we compare the ith element with the largest
//                secondLargest = largest;// if the ith element is greater than current largest then we will change the value of sec lar to largest , and largest become the ith element
//                largest = arr[i];
//            } else if(secondLargest <arr[i]&& arr[i] !=largest){// if we have 2 largest element in the array then the second largest become also the largest taht why we
//                //put this condition here.
//                secondLargest = arr[i];//
//            }
//        }
//        return secondLargest;// finally returning the value of second largest in the array
//
//    }
    public static int Secondlar(int[] arr) {
        if (arr.length == 0){
            return  Integer.MIN_VALUE;
        }
        int largest = arr[0], secLar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {


            if (largest < arr[i]) {
                secLar = largest;
                largest = arr[i];
            } else if (secLar < arr[i] && arr[i] != largest) {
                secLar = arr[i];
            }
        }

        return secLar;
    }


}
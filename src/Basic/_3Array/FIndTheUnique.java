package Basic._3Array;

public class FIndTheUnique {
    public static void main(String[] args) {
        int [ ] arr = { 1,3,4,3,5,4,1};
        findU(arr);
    }
    public  static void findU( int []arr){

            int uni = 0 ;
            for( int val : arr){
                uni = uni ^val;
            }
            System.out.println(uni);
        }


    }






















//    public static int fundU(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int j;
//            for (j = 0; j < arr.length; j++) {
//                if (i != j) {
//                    if (arr[i] == arr[j]) ;
//                    break;
//                }
//            }
//
//            if (j == arr.length) {
//                return arr[i];
//            }
//
//        }
//            return Integer.MAX_VALUE;
//    }
//   the above method have the time complexity of 0(n2);
//    which is not good so we will find the another approach for solving this problem







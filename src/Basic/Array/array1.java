package Basic.Array;

public class array1 {
    public static void main(String[] args) {
        int[] arr = new int [10];
        arr[0]=5;
        arr[5]=18;
        System.out.println(arr[0]);
        System.out.println(arr[5]);


        char [] c = new char [10];
        double [] d = new double[10];
        System.out.println(c[0]);//will print the null array
        //for charter array it is always a null character by default

        System.out.println(d[0]);


    }
}

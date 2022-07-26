package Basic._4Array2SearchingAlgo;

public class _9CheckArrayRotation {
    public static void main(String[] args) {
         int [] arr ={ 10 ,20 ,30 ,1};
        System.out.println(check(arr));
    }

    public static int  check( int [] c ){
        for ( int i =0 ;i<c.length;i++){
            if(c[i]>c[i+1]){
                return i+1;
            }
        }
        return 0;
    }
}

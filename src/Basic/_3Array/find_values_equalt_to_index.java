package Basic._3Array;

public class find_values_equalt_to_index
{
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer>ans = new ArrayList<Integer>();
        for( int i = 0 ; i< n ;i++){
            if( arr[i] == i+1){
                ans.add(i+1);
            }
        }

        return ans;
    }
}

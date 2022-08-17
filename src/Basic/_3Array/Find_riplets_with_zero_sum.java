package Basic._3Array;

public class Find_riplets_with_zero_sum {
    public boolean findTriplets(int arr[] , int n)
    {
        //add code here.

        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            int l = i+1,r = n-1;

            while(l < r)
            {
                if(arr[l]+arr[i]+arr[r] == 0)
                {
                    return true;
                }
                else if(arr[l]+arr[i]+arr[r] < 0)
                {
                    l += 1;
                }
                else
                {
                    r -= 1;
                }
            }
        }

        return false;
    }
}

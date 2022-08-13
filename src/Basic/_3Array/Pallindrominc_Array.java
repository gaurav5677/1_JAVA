package Basic._3Array;

public class Pallindrominc_Array {
    //Palindromic Array
    //SchoolAccuracy: 50.0%Submissions: 55526Points: 0
    //Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
    //
    //
    //
    //Example:
    //Input:
    //2
    //5
    //111 222 333 444 555
    //3
    //121 131 20
    //
    //Output:
    //1
    //0

    private static boolean palan(int a)
    {
        int sum=0;
        int x=a;
        while(a>0)
        {
            int k=a%10;
            sum=sum*10+k;
            a=a/10;
        }
        if(sum==x)
            return true;
        return false;

    }
    public static int palinArray(int[] a, int n)
    {
        //add code here.
        int i;
        for(i=0;i<n;i++)
        {
            boolean k=palan(a[i]);
            if(k==false)
                return 0;
        }
        return 1;
    }

}

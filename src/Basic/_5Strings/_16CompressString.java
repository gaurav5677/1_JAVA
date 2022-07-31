package Basic._5Strings;




public class _16CompressString {
    public static void main(String[] args) {

        String str = "aaabbcddeeee";
        System.out.println(compress(str));
    }


    public static String compress(String a) {
    int n = a.length();
    String ans=" ";

    if(n==0){ // if the length is 0 we will direcctly  return the ans
         return ans;
    }

    int currentCharCount=1; // count will start from 1 .
    ans += a.charAt(0);// as the expected output, the !st char will comees first and the count value.
    for( int i = 1 ;i<n ; ++i){// here the loop will  check whether the ith-1 and the ith element ans same or not
        if( a.charAt(i)==a.charAt(i-1)){
            ++currentCharCount;
        }else{
            if(currentCharCount>1){ //  here it will chekc if the cpunt is greater than 1 then it will append the count
                // with single char
                ans+=currentCharCount;
                currentCharCount=1;
            }
            ans+=a.charAt(i);
        }
    }
if (currentCharCount>1){
    ans+=currentCharCount;
}
return ans;
    }

}

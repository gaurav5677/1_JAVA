package Basic._5Strings;

public class _15HighestOccuringCharacter {
    public static void main(String[] args) {
        String str = "abcdeapapqarr";
        System.out.println(hightestOccuring(str));


    }

    public static char hightestOccuring(String str) {
        int n = str.length();
        int max = 0;
        int[] frequence = new int[256];
        for (int i = 0; i < n; i++) {
            frequence[str.charAt(i)]++;
            max = Math.max(max, frequence[str.charAt(i)]);
        }
        char ans = ' ';
         for( int i = 0 ;  i< n ;i++){
           if(frequence[str.charAt(i)]== max){
               ans = str.charAt(i);
               break;
             }
         }



        return ans;
    }
}



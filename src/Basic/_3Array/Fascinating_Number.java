package Basic._3Array;

public class Fascinating_Number {
    String m=Long.toString(n);
    String m2=Long.toString(n*2);
    String m3=Long.toString(n*3);
    String str=m+m2+m3;
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
            if (str.charAt(i) == str.charAt(j) || str.charAt(i)=='0')
            return false;
        return true;
}


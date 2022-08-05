package DSA_IN_JAVA._1OOps;

import java.util.Scanner;

public class _2OppsUse {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        _1OOPS s1 = new _1OOPS();// here we create object by using "new." // here we get new _100Ps object which have all the properties.
        _1OOPS s2 = new _1OOPS();
        // here s2 and s1 are the refreance
        System.out.println(s1);
        s1.name="hey there.";
        s1.rollNumber=10;

        System.out.println(s1.name+" "+ s1.rollNumber);
    }
}

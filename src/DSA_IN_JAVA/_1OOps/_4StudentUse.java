package DSA_IN_JAVA._1OOps;

public class _4StudentUse {
    public static void main(String[] arges){
        _3Student n1=new _3Student();// "new" will create new block of memories  same goes for n2 as well
        _3Student n2 = new _3Student();
        System.out.println(n1.name);
        n1.name =" Gaurav ";
        n2.rollnumber = 48;
        System.out.println(n1.name + " "+n2.rollnumber);
        n2.name = " adam  ";
        n2.rollnumber = 43;
        System.out.println(n2.name + " "+ n2.rollnumber);
        System.out.println(n2.rollnumber);
    }
}

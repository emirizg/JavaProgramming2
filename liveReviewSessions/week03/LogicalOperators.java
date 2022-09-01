package week03;

public class LogicalOperators {

    public static void main(String[] args) {

        int a =20;
        int o=30;
        int p =30;

        // interview question asked, tricky

        boolean comp = a < o || --o >= p; // true || false : Logical OR if the first expression is True; it does not compile second part
        System.out.println("comp = " + comp);
        System.out.println("o = " + o);

        boolean compTwo= a>o || o-- >= p; // false || true : true 0 = 29
        System.out.println("compTwo = " + compTwo);
        System.out.println("o = " + o);

        boolean compThre = a > o && ++o >= p; // false && compiler does not check
        System.out.println("compThre = " + compThre);
        System.out.println("o = " + o); // 29

    }

}

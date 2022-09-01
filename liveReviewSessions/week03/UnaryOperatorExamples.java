package week03;

public class UnaryOperatorExamples {

    public static void main(String[] args) {

        int a=25;

        System.out.println(++a); // pre-increment --> 26
        System.out.println(--a); // pre-decrement --> 25

        int b=25;

        System.out.println(b++); // post-increment 25 --> first use the value then increase-- print 25 then increase to 26
        System.out.println(b--); // post-decrement 26 --> first use the value then decrase
        System.out.println(b);   // 25

        System.out.println("----Unary Task----");
        // task 18

        int x=2;
        int y= x++;
        System.out.println("y = " + y); // 2
        System.out.println("x = " + x); // 3


        a = 50;

        a = --a + a++ + a-- + a++; // 49 + 49 50 + 49
        System.out.println("a = " + a); // 197


        a = 1;
        a = -a-- + a++ / -a-- * --a; // -1 + (-2 / +1 * 0)
        System.out.println("a = " + a); // -1

        x=4;
        y = x * 4 - x++; // 4*4 - 4 = 12

        boolean b1=true;
        System.out.println(!b1); //unary not operator
    }

}

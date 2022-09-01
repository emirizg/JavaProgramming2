package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args){

        // + -

        int num1= +25; // its optianal
        int num2= -25; // its not optianal

        System.out.println(num1<0); // false
        System.out.println(num2<0); // true

        System.out.println("------------------------------------------");

        /* Pre Increment/Decrement
        - Increment/decrement operators are placed before the oper
        - Increases/Decreases the value by 1 in the memort
         int a =25;
         System.out.println(++a); --> 26
         System.out.println(--a); --> 25
        */

        int a=5;
        ++a; // pre increment: increases the value by 1 right away
        System.out.println(a);

        --a; // pre decrement: decreases the value by 1 right away

        System.out.println(a);

        System.out.println("------------------------------------------");

        int b=100;
        System.out.println(++b); // pre increment: increases the value by 1 right away

        int c=100;
        System.out.println(c++); // post increment: 100 post --> in the next step
        // first passes the current value, then increases the value by 1
        System.out.println(c); // 101

        System.out.println("--------------------------------------------");

        int x=200;
        System.out.println(--x); // pre decrement operator

        int y=200;
        System.out.println(y--); // post decrement: first passes the current value, then decreases the value by 1
        System.out.println(y); //199

        System.out.println("------------------------------------------------");

        int z=45;
        System.out.println(++z); // 46, z=46
        System.out.println(z++); // 46, z=47
        System.out.println(z);   // 47, z=47

        int q=30;
        System.out.println(--q); // 29, q=29
        System.out.println(q--); // 29, q=28
        System.out.println(q);   // 28, q=28

    }

}

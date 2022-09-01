package day18_NestedLoop;

public class Shape {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        for (int j = 0; j < 1; j++) {
            System.out.print("* ");
        }

    }

}
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 * * * * * * * * *
 * * * * * * * * * *

 */
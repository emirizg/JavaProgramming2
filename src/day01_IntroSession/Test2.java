package day01_IntroSession;

public class Test2 {

    public static void main(String[] args) {

        /*
        Write a program to print following pattern:

        outer loop should iterates: 6 times

        ******
        *****
        ****
        ***
        **
        *

         */
        //outer loops rows
        for (int i=0 ; i<6 ; i++) {

            //inner loop for columns
            for (int j=i ; j<6 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }





        System.out.println("-------------------------------");

        int n=6;
        for (int i = 1; i <= n; i++) {
            int p=1;
            for (int j = 1; j <= i ; j++) {
                System.out.print(p++ +" ");
            }
            System.out.println();
        }

        n=5;
        for (int i = 1; i <= n; i++) {
            int p=5;
            for (int j = p--; j >= 1 ; j--) {
                System.out.print(p-- +" ");
            }
            System.out.println();
        }

    }

}

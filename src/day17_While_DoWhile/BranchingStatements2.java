package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        /*
        - For using continue you must have a loop
        - For using break statement you must have a loop or switch
         */

        for (char i='A';i<='E';i++){

            if (i=='C') {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------------------");

        // print all even numbers 1~10 (skip the odd numbers)
        for (int i=1;i<=10;i++){

            if (!(i%2==0)) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------------------");

        // print all odd numbers 1~10 (skip the even numbers)
        for (int i=1;i<=10;i++){

            if (i%2==0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------------------");

        if (true){

        }


    }

}

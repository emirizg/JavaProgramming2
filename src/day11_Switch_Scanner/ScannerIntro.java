package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    /*
     -   System.out ==>> out meaning displaying out->output
     -   System.in ==>> in meaning getting freom keyboard in->input
     -   Provides the methods to get inputs
     -   need to be imported in our program, presented in java.util package
     -
     -
     -
     -
     -
         */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1= scan.nextInt();

        System.out.print("Enter a decimal: ");
        double num2= scan.nextDouble();

        //System.out.println(scan.nextInt());
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+(num1*num2));


        scan.close(); // closes the scanner,  after this scanner can not be used anymore

        /*
        System.out.print("Enter an integer: ");
        int num3=scan.nextInt();

        System.out.println(num3);

         */


    }

}

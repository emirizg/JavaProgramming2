package day17_While_DoWhile.tasks;

import java.util.Scanner;

public class UntilNeg {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        int result=0;
        while (true){

            System.out.println("Enter a num: ");
            int num1=input.nextInt();

            if (num1<0){
                System.err.println("Entered negative number");
                break;
            }
            result+=num1;

        }

        input.close();
        System.out.println(result);
    }

}
/*

	2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */
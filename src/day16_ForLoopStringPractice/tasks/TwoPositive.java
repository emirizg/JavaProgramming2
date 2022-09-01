package day16_ForLoopStringPractice.tasks;

import java.util.Scanner;

public class TwoPositive {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter two number: ");
        int num1=input.nextInt();
        int num2=input.nextInt();

        int result=0;

        if (num1 > 0 && num2 > 0){

            for (int i=1;i<=num2;i++){
                result+=num1;
            }

            System.out.println(result);

        }else {
            System.out.println("Invalid");
        }

    }

}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */
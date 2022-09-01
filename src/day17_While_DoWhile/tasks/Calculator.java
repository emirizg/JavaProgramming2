package day17_While_DoWhile.tasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int result=0;

        System.out.println("Enter two number: ");
        int num1=input.nextInt();
        int num2=input.nextInt();

        while (true){
            System.out.println("Enter a math operator: ");
            String ch=input.next();

            while ( !(ch.equals("+") || ch.equals("/") || ch.equals("*") || ch.equals("-")) ){
                System.err.println("Invalid entry, Enter a math operator: ");
                ch=input.next();
            }
             switch (ch){

                 case "+":
                     result=num1+num2;
                     break;
                 case "-":
                     result=num1-num2;
                     break;
                 case "*":
                     result=num1*num2;
                     break;
                 case "/":
                     result=num1/num2;
                     break;
             }

            System.out.println(result);

            if ((ch.equals("+") || ch.equals("/") || ch.equals("*") || ch.equals("-")))
            {
                break;
            }
        }

        input.close();
    }
    
}
/*
3. write a program to ask user to enter two number and math operator, and return the result.
			
		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator 
		(+, -, *, /)

 */
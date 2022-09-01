package day18_NestedLoop.tasks;

import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result = 0;

        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter a math operator(+,-,/,*) : ");
        char mathOp = input.next().charAt(0);

        while (!(mathOp == '+' || mathOp == '-' || mathOp == '/' || mathOp == '*')) {

            System.err.print("Invalid entry, Enter a math operator(+,-,/,*) : ");
            mathOp = input.next().charAt(0);

        }


        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();

        switch (mathOp) {

            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;

        }

        System.out.println("result = " + result);


        System.out.print("Do you want to continue? : ");
        String answer=input.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no")) ){

            System.err.println("Invalid entry, Do you want to continue? : ");
            answer=input.next().toLowerCase();


        }

        if (answer.equals("no")){
            System.out.println("Thanks for using Cydeo calculator!");
        }

        while (answer.equals("yes")){

            System.out.print("Enter the first number: ");
             firstNum = input.nextInt();

            System.out.print("Enter a math operator(+,-,/,*) : ");
             mathOp = input.next().charAt(0);

            while (!(mathOp == '+' || mathOp == '-' || mathOp == '/' || mathOp == '*')) {

                System.err.print("Invalid entry, Enter a math operator(+,-,/,*) : ");
                mathOp = input.next().charAt(0);

            }


            System.out.print("Enter the second number: ");
             secondNum = input.nextInt();

            switch (mathOp) {

                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    result = firstNum / secondNum;
                    break;

            }

            System.out.println("result = " + result);


            System.out.print("Do you want to continue? : ");
            answer=input.next().toLowerCase();

            if (answer.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }

        }

        input.close();

    }

}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
package day19_LoopPractices.tasks;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the side of the square:");
        double s=input.nextInt();

        if (s==0 || s<0){
            System.err.println("Invalid Entry for the side of the square");
            System.exit(0);
        }

        double area=(s*s);
        double perimeter=(4*s);

        System.out.println("Area of square: "+area+"\nPerimeter of square: "+perimeter);

        System.out.println("Would you like to calculate another Square?");
        String answer=input.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no")) ){

            System.err.println("Invalid entry, Would you like to calculate another Square?");
            answer=input.next().toLowerCase();

        }

        if (answer.equals("no")){
            System.out.println("Thank you for using Cydeo Square Calculator APP");
        }

        while (answer.equals("yes")){

            System.out.println("Enter the side of the square:");
             s=input.nextInt();

            if (s==0 || s<0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            area=(s*s);
            perimeter=(4*s);

            System.out.println("Area of square: "+area+"\nPerimeter of square: "+perimeter);

            System.out.println("Would you like to calculate another Square?");
            answer=input.next().toLowerCase();

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }

        }

        input.close();
    }

}
/*2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying
				 the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry


 */
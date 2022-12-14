package day19_LoopPractices.tasks;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double PI=3.14;
        System.out.println("Enter the radius of the circle:");
        int radius=scan.nextInt();

        if ( radius==0 || radius<0 ){
            System.err.println("Invalid Entry for the radius of the circle");
            System.exit(0);
        }

        double diameter= radius*2;
        double area=PI*(radius*radius);
        double perimeter=2*PI*radius;

        System.out.println("Diameter of circle: "+diameter+"\nArea of circle: "+area+"\nPerimeter of circle: "+perimeter);

        System.out.println("Would you like to calculate another circle?");
        String answer=scan.next().toLowerCase();

        while( !(answer.equals("yes") || answer.equals("no") ) ){

            System.err.println("Invalid entry, Would you like to calculate another circle?");
            answer=scan.next().toLowerCase();

        }

        if (answer.equals("no")){
            System.out.println("Thank you for using Cydeo Circle Calculator APP");
            System.exit(0);
        }

        while (answer.equals("yes")){
            System.out.println("Enter the radius of the circle:");
            radius=scan.nextInt();

            if ( radius==0 || radius<0 ){
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            diameter= radius*2;
            area=PI*(radius*radius);
            perimeter=2*PI*radius;

            System.out.println("Diameter of circle: "+diameter+"\nArea of circle: "+area+"\nPerimeter of circle: "+perimeter);

            System.out.println("Would you like to calculate another circle?");
            answer=scan.next().toLowerCase();

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }

        }

        scan.close();
    }

}
/*
1. Write a program that can calculate the area and perimeter of a circle:
	1. Ask the user "Enter the radius of the circle:"
  if user enters 0 or negative numbers, terminate the program after displaying the error message
  "Invalid Entry for the radius of the circle"

	2. Display:
					1. Diameter of circle ---> double diameter= radius*2;
					2. Area of circle  --> double area=PI*(radius*radius);
					3. Perimeter of circle  --> double perimeter=2*PI*radius;

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
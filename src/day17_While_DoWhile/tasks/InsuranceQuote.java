package day17_While_DoWhile.tasks;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int total=0;

        System.out.print("Enter your name: ");
        String name=scan.nextLine();

        System.out.print("Enter your gender: ");
        String gender=scan.next().toLowerCase();

        while (!(gender.equals("male") || gender.equals("female"))) {
            System.err.print("Invalid, Enter your gender: ");
            gender = scan.next().toLowerCase();
        }

        System.out.print("Are you married? : ");
        String isMarried=scan.next();

        while (!(isMarried.equals("yes") || isMarried.equals("no"))) {
            System.err.print("Invalid, Are you married? : ");
            isMarried = scan.next().toLowerCase();
        }

        System.out.print("Enter your age: ");
        int age=scan.nextInt();

        while (!(age > 0 && age <120) ) {
            System.err.print("Invalid, Enter your age: ");
            age=scan.nextInt();
        }

        System.out.print("How many miles do you drive in a day? : ");
        int miles=scan.nextInt();

        while (!(miles > 0 && miles <=50) ) {
            System.err.print("Invalid, How many miles do you drive in a day? : ");
            miles=scan.nextInt();
        }

        System.out.print("Do you want full coverage or liability insurance? : ");
        scan.nextLine();
        String coverage=scan.nextLine().toLowerCase();

        System.out.print("Have you had any accidents or claims in past 5 years? :");
        String accident=scan.next();

        while (!(accident.equals("yes") || accident.equals("no"))) {
            System.err.print("Invalid, Have you had any accidents or claims in past 5 years? :");
            accident = scan.next().toLowerCase();
        }

        System.out.print("Do you have an anti-theft device? : ");
        String anti_theft=scan.next();

        while (!(anti_theft.equals("yes") || anti_theft.equals("no"))) {
            System.err.print("Invalid, Do you have an anti-theft device? : ");
            anti_theft = scan.next().toLowerCase();
        }

        if (coverage.equals("liability")){

            if (age<25){
                total+=90;
            }else {
                total+=50;
            }

            if (miles<=10){
                total+=10;
            } else if (miles > 10 && miles <= 50) {
                total+=30;
            }else {
                total+=50;
            }


        } else if (coverage.equals("full coverage")) {

            if (age<25){
                total+=160;
            }else {
                total+=120;
            }

            if (miles<=10){
                total+=20;
            } else if (miles > 10 && miles <= 50) {
                total+=40;
            }else {
                total+=70;
            }

        }

        if (anti_theft.equals("yes")){
            total-= total*0.05;
        }

        if (accident.equals("yes")){
            total+= total*0.15;
        }

        if (accident.equals("no")){
            total-= total*0.15;
        }

        if (isMarried.equals("yes")){
            total-= total*0.05;
        }

        System.out.println("total = " + total);

    }

}
/*
 6. Create a class called InsuranceQuote, write a program that can calculate the insurance
    cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70

			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount

 */
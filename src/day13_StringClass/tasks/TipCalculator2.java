package day13_StringClass.tasks;

import java.util.Scanner;

public class TipCalculator2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?: ");
        String split=scan.next();

        System.out.println("Enter the number of people: ");
        int numPeo=scan.nextInt();

        System.out.println("Enter the check amount: ");
        double amount=scan.nextDouble();

        System.out.println("How was the service quality? (ExcClLent/Great/Good/Fair/Poor) ");
        String quality=scan.next().toLowerCase();

        double totalTip=0;
        double totalPerPerson=0;
        double tipPerPerson=0;


        if (quality.equals("excellent")){
            totalTip=amount *= 0.25;
        } else if (quality.equals("great")) {
            totalTip=amount *= 0.20;
        }else if (quality.equals("good")) {
           totalTip= amount *= 0.15;
        }else if (quality.equals("fair")) {
            totalTip=amount *= 0.10;
        }else if(quality.equals("poor")){
           totalTip = amount *= 0.05;
        }

        double totalToPay=amount+totalTip;

        System.out.println("Number of people entered: "+numPeo);
        System.out.println("Total to pay: "+totalToPay);
        System.out.println("Total tip: "+totalTip);

        if (split.equals("yes")){
            totalPerPerson=amount/numPeo;
            tipPerPerson=totalTip/numPeo;
            System.out.println("totalPerPerson = " + totalPerPerson);
            System.out.println("tipPerPerson = " + tipPerPerson);
        }

    }

}
/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and
if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output)
	Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */

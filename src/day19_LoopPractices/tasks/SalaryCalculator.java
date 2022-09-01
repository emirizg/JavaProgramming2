package day19_LoopPractices.tasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How much you make an hour?");
        int hourlyRate = scan.nextInt();

        if (hourlyRate == 0 || hourlyRate < 0) {
            System.err.println("Invalid entry for Hourly Rate");
            System.exit(0);
        }

        System.out.println("How many hours do you work per week?");
        int weeklyHour = scan.nextInt();

        if (weeklyHour > 144 || weeklyHour < 1) {
            System.err.println("Invalid Entry for Weekly Hours");
            System.exit(0);
        }

        System.out.println("Enter your state tax rate");
        double state = scan.nextInt();

        if (state < 0 || state > 10) {
            System.err.println("Invalid Entry for state tax rate");
            System.exit(0);
        }

        int grossSalary = hourlyRate * weeklyHour * 52;
        double federalTax = grossSalary * 0.26;
        double stateTax = grossSalary * (state / 100);
        double totalTax = federalTax + stateTax;
        double netIncome = grossSalary - totalTax;

        System.out.println("1. Gross Salary: " + grossSalary +
                "\n2. Federal Tax: " + federalTax +
                "\n3. State Tax: " + stateTax +
                "\n4. Total Tax: " + totalTax +
                "\n5. Net Income: " + netIncome);

        System.out.println("Would you like to continue?");
        String answer = scan.next().toLowerCase();

        if (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry.");
            System.exit(0);
        }

        if (answer.equals("no")) {
            System.out.println("Thank you for using Cydeo Salary Calculator APP");
        }

        while (answer.equals("yes")) {

            System.out.println("How much you make an hour?");
            hourlyRate = scan.nextInt();

            if (hourlyRate == 0 || hourlyRate < 0) {
                System.err.println("Invalid entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            weeklyHour = scan.nextInt();

            if (weeklyHour > 144 || weeklyHour < 1) {
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            state = scan.nextInt();

            if (state < 0 || state > 10) {
                System.err.println("Invalid Entry for state tax rate");
                System.exit(0);
            }

            grossSalary = hourlyRate * weeklyHour * 52;
            federalTax = grossSalary * 0.26;
            stateTax = grossSalary * (state / 100);
            totalTax = federalTax + stateTax;
            netIncome = grossSalary - totalTax;

            System.out.println("1. Gross Salary: " + grossSalary +
                    "\n2. Federal Tax: " + federalTax +
                    "\n3. State Tax: " + stateTax +
                    "\n4. Total Tax: " + totalTax +
                    "\n5. Net Income: " + netIncome);

            System.out.println("Would you like to continue?");
            answer = scan.next().toLowerCase();

            if (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry.");
                break;
            }

            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }

        }


    }

}
/*

	5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying
					the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate t
					he program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying
					the error message "Invalid Entry for state tax Rate"

			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message
				"Invalid Entry"

 */
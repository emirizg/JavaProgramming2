package day12_Scanner.tasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter your hourly rate: ");
        int hourlyRate=input.nextInt();

        System.out.print("Enter how many hours you work in a week: ");
        int hours=input.nextInt();

        System.out.print("Enter state tax: ");
        double stateTaxRate=input.nextDouble();

        System.out.print("Enter federal tax: ");
        double federalTaxRate=input.nextDouble();

        int salaryBeforeTax=52*hourlyRate*hours;
        double stateTax= salaryBeforeTax * stateTaxRate/100 ;
        double federalTax= federalTaxRate*salaryBeforeTax/100;
        double totalTax= stateTax+federalTax;
        double salaryAfterTax=salaryBeforeTax-totalTax;

        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);



    }

}
/*
3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */
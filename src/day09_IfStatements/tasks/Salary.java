package day09_IfStatements.tasks;

public class Salary {

    public static void main(String[] args) {

        int salary=150_000;
        double salaryAfterTax;
        System.out.println("Salary before tax = "+ salary);

        char married='M'; // M(arried) or S(ingle)
        boolean isMarried= married=='M';


        if (isMarried){

            if (salary >= 130_000) {
                salaryAfterTax = salary - (salary * 30 / 100);
            } else if (salary >= 100_000 && salary < 130_000) {
                salaryAfterTax = salary - (salary * 25 / 100);
            } else if (salary >= 80_000 && salary < 100_000) {
                salaryAfterTax = salary - (salary * 20 / 100);
            } else {
                salaryAfterTax = salary - (salary * 15 / 100);
            }

        }
        else {

            if (salary >= 130_000) {
                salaryAfterTax = salary - (salary * 35 / 100);
            } else if (salary >= 100_000 && salary < 130_000) {
                salaryAfterTax = salary - (salary * 30 / 100);
            } else if (salary >= 80_000 && salary < 100_000) {
                salaryAfterTax = salary - (salary * 25 / 100);
            } else {
                salaryAfterTax = salary - (salary * 20 / 100);
            }
        }

        System.out.println("Salary After Tax  = " + salaryAfterTax);

    }

}

/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                      35% for salary of 130K or more
      			      30% for salary of 100K to 130k (excluded)
      			      25% for salary of 80K to 100K (excluded)
      			      20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
 */
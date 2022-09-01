package day08_IfStatement;

public class NumberOfDays {

    public static void main(String[] args) {

        int num=2; // 1 ~ 12

        boolean has28days = num == 2; // for the months that has 28 days
        boolean has30days= num == 4 || num == 6 || num == 9 || num == 11; // for the months that has 30 days

        // boolean has31days= num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num ==12 ; // for the months thas has 31 days
        boolean has31days= !has28days && !has30days;

        if (has31days){ // if the month has 31 days
            System.out.println("31 days!");
        }
        if (has30days){ // if the month has 30 days
            System.out.println("30 days!");
        }
        if (has28days){ // if the month has 28 days
            System.out.println("28 days!");
        }

    }

}
/*
3. Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2


 */
package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=scan.nextInt();

        scan.nextLine(); //I dont need to assign it to a variable

        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa= scan.nextDouble();;

        scan.nextLine(); //

        System.out.println("Enter your School Name: ");
        String schoolName=scan.nextLine();

        scan.close();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

    }

}

/*
1. Ask the user to enter age nextInt();
2. Ask the user to enter full name nextLine();
 */
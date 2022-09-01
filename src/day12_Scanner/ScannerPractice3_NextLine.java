package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        // .nextLine();
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine(); // Wooden SpoonEnter

        System.out.println("Enter your Programming Language: ");
        String programming=scan.nextLine(); // Java Programming LanguageEnter

        System.out.println("Enter your age: ");
        int age=scan.nextInt(); // 24

        scan.nextLine(); // Enter --> This is the only method that can take out the "Enter" key you have left in the Scanner
        // capture the Enter key that user pressed for nextInt();
        // if we are using nextLine(); method after the other methods of Scanner, we MUST provide one addition nextLine();

        System.out.println("Enter your school name: ");
        String schoolName=scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        scan.close();
    }

}

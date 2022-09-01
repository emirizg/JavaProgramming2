package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your Full name: ");
        String fullName=scan.nextLine(); // Java Programming

        System.out.println("Enter your Building number: ");
        String buildingNumber=scan.next();

        scan.nextLine();

        System.out.println("Enter your Street name: ");
        String streetName=scan.nextLine();

        System.out.println("Enter your City name: ");
        String city=scan.nextLine();

        System.out.println("Enter your State: ");
        String state=scan.next();

        System.out.println("Enter your ZIP code: ");
        String zipCode=scan.next();

        scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

    }

}
/*
1. Enter your full name --> nextLine()
2. Enter your building number --> next()  ------- I need to clean up the Scanner's memory
3. Enter your street name --> nextLine()
4. Enter your city name --> nextLine()
5. Enter your state --> next()
6. Enter your zip code --> next()

Display the shipping address
John Smith
7925 Jones Branch Dr
Mclean, Va 20122

 */
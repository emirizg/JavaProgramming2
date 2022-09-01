package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName="Emre";
        String lastName="Barza";
        int age= 45;
        String jobtitle="Senior SDET";
        String companyName="Apple Inc";
        double salary=1000000.58;

        String fullName=firstName + " " + lastName;

        // Full name of the person is ____
        System.out.println("Full name of the person is " + fullName);

        // __ is __ years old.
        System.out.println(fullName+" is " + age + " years old.");

        // FullName is jobtitle +, works at CompanyName, and Fullname' salary is + salary
        System.out.println(fullName+" is "+jobtitle+", works at "+companyName+", and "+fullName+"' salary is $"+salary);


    }

}

/*
Create a classcalled FullName.java 2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
 */

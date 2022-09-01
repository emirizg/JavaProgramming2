package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        String name="Aaron";
        int age =34;
        String citizen="North Korea";

        boolean isEligible = age >= 18 && citizen=="USA";

        System.out.println(name+" is eligible to vote: "+isEligible);

        System.out.println("-------------------------------------------");

        String name2="Josh";

        int crediScore=620;
        int age2=23;
        int income = 40000;

        boolean isEligible2= crediScore >= 700 && age2 >= 21 && income>=60000;

        System.out.println(name2 + " is eligible for loan: "+isEligible2);

        System.out.println("-------------------------------------------------");

        String name3="Shay";
        int age3=21;
        char gender='F';

        boolean isEligible3 = age3 >= 18 && (gender=='M' || gender=='F');

        System.out.println(name3 + " is eligible to register: "+isEligible3);

        System.out.println("-------------------------------------------------");

        String name4="James";
        String countryOfBirth ="USA";
        boolean marriedToUSCitizen= false;

        boolean isEligible4= countryOfBirth == "USA"|| marriedToUSCitizen ==true;

        System.out.println(name4+" is eligible to apply for US citizenShip: "+isEligible4);

        System.out.println("-------------------------------------------------");

        String student ="Anna";
        double gpa=3.4;
        int familyIncome=100_000;

        boolean isEligible5= gpa >= 3.5 || familyIncome <= 60_000;

        System.out.println(student + " is eligible for scholarship: "+isEligible5);

        System.out.println("-------------------------------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2; // opposite condition
        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------------------");

        int examScore=55;
        boolean passed= examScore >= 60;
        boolean failed= !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }

}

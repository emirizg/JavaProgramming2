package day27_WrapperClasses.tasks;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String str = scan.nextLine();

        char[] ch = str.toCharArray();
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount=0;
        int specialCount=0;

        //Password MUST be at least have 8 characters long, and should not contain space
        if (str.length() < 8 || str.contains(" ")) {
            System.err.println("Password MUST be at least have 8 characters long, and should not contain space");
            System.exit(0);
        }

        for (char each : ch) {

            if (Character.isUpperCase( each)  ){
                upperCount++;
            }
            if (Character.isLowerCase( each)  ){
                lowerCount++;
            }
            if (Character.isDigit( each)  ){
                digitCount++;
            }
            if ( !Character.isLetterOrDigit( each)  ){
                specialCount++;
            }
        }



        //PassWord should at least contain one upper case and lower case letter
        if (upperCount < 1 || lowerCount < 1 || digitCount < 1 || specialCount < 1){
            System.err.println("PassWord should at least contain one upper case and lower case letter and one special and a digit");
            System.exit(0);
        }

        System.out.println("Your password is correct: "+ str);


    }

}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */
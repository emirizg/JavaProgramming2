package day53_FunctionalInterface.tasks;

import java.util.function.Predicate;

public class PredicateFunction {

    public static void main(String[] args) {

        //3.1 Create a function that can verify if a string
        //contains duplicated characters

        Predicate<String> isContainsDuplicated = str -> {

            boolean isDuplicated = false;

            String[] arr = str.split("");


            for (int i = 0; i < arr.length; i++) {

                int counter = 0;

                for (int j = 0; j < arr.length; j++) {

                    if (arr[i].equalsIgnoreCase(arr[j])) {
                        counter++;
                    }

                }

                if (counter > 1) {
                    return true;
                }

            }

            return isDuplicated;
        };

        boolean a = isContainsDuplicated.test("Eemir");

        System.out.println(a);

        System.out.println("-------------------------------------------------------");


        /*
        1 Password must be at least have 8
characters long, and should not contain space
        2 PassWord should at least contain one
upper case letter
        3 PassWord should at least contain one
lower case letter
        4 Password should at least contain one
special characters
        5 Password should at least contain a digit
         */


        Predicate<String> isStrongPassword = str -> {

            boolean length = str.length() >= 8;
            boolean containsSpace = !str.contains(" ");

            int upperCaseCounter = 0;
            int lowerCaseCounter = 0;
            int digitCounter = 0;
            int specialCounter = 0;

            char[] charArray = str.toCharArray();

            for (char eachChar : charArray) {

                if (Character.isUpperCase(eachChar)) {
                    upperCaseCounter++;
                } else if (Character.isLowerCase(eachChar)) {
                    lowerCaseCounter++;
                }

                if (Character.isDigit(eachChar)){
                    digitCounter++;
                } else if (!Character.isLetterOrDigit(eachChar)) {
                    specialCounter++;
                }

            }

            boolean atLeastOneUpperCase = upperCaseCounter >= 1;
            boolean atLeastOneLowerCase = lowerCaseCounter >= 1;
            boolean atLeastOneSpeacial =  specialCounter >= 1;
            boolean atLeastOneDigit =  digitCounter >= 1;

            return length && containsSpace && atLeastOneUpperCase && atLeastOneLowerCase && atLeastOneSpeacial && atLeastOneDigit;

        };

        System.out.println(isStrongPassword.test("Emir@123aa"));

    }

}
/*
3. Use Predicate Functional interface to:
3.1 Create a function that can verify if a string
contains duplicated characters
3.2 Create a function that can verify if a password is a
strong password. Characteristics of strong passwords are:
        1 Password must be at least have 8
characters long, and should not contain space
        2 PassWord should at least contain one
upper case letter
        3 PassWord should at least contain one
lower case letter
        4 Password should at least contain one
special characters
        5 Password should at least contain a digit
 */
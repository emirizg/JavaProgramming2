package day14_String.tasks;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email=input.nextLine();

        if (email.contains("_")){
            String name=email.substring(0,email.indexOf('_'));
            String surname=email.substring(email.indexOf("_")+1,email.indexOf('@'));
            String domain=email.substring(email.indexOf('@')+1,email.indexOf('.'));

            String  nameFirst=name.substring(0,1);
            String  surnameFirst=surname.substring(0,1);

            nameFirst=nameFirst.toUpperCase();
            surnameFirst=surnameFirst.toUpperCase();

            String newName=nameFirst+name.substring(1);
            String newSurname=surnameFirst+surname.substring(1);

            System.out.println("First name: "+newName);
            System.out.println("Last name: "+newSurname);
            System.out.println("Domain: "+ domain);


        }else {
            System.out.println(email);
        }

        input.close();

    }

}
/*
8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */
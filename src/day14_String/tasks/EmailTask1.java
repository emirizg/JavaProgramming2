package day14_String.tasks;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email=input.nextLine();

        if (email.contains("_")){
            String name=email.substring(0,email.indexOf('_'));
            String surname=email.substring(email.indexOf("_")+1,email.indexOf('@'));
            String mail=email.substring(email.indexOf('@'));

            String newMail=surname+"_"+name+mail;

            System.out.println(newMail);
        }else {
            System.out.println(email);
        }

        input.close();

    }

}
/*

    7. Create a class called EmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */
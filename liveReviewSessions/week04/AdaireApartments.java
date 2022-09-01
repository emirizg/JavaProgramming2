package week04;

import java.util.Scanner;

public class AdaireApartments {

    public static void main(String[] args) {

        int floorNumber; // Declaring my variable no value

        Scanner input = new Scanner(System.in);

        // ask the user for which floor the user is living
        System.out.println("Which flooe are you living?");
        floorNumber=input.nextInt();

        // with if else statement
        System.out.println("With if else statement");

        if (floorNumber==1){ // condition
            System.out.println("You are living at First Floor"); // action
        } else if (floorNumber==2) {
            System.out.println("You are living at second floor");
        } else if (floorNumber == 3) {
            System.out.println("You are living at third floor");
        }else {
            System.err.println("There is NO such floor");
        }

        System.out.println("With Switch Statements");
        // Switch statement

        switch (floorNumber){

            case 1:
                System.out.println("You are living at First Floor"); // action
                break;
            case 2:
                System.out.println("You are living at Second Floor"); // action
                break;
            case 3:
                System.out.println("You are living at Third Floor"); // action
                break;
            default:
                System.out.println("There is NO such floor");

        }


        input.close();


    }

}

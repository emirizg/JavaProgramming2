package day17_While_DoWhile.tasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Do you want to book a room?");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry, Do you want to book a room?");
            answer = input.next().toLowerCase();
        }

        if (answer.equals("yes")) {

            System.out.println("Which type of room do you want to book?\nKing bed\nQueen Bed\nSingle Bed");

            input.nextLine();
            String bed = input.nextLine().toLowerCase();

            while (! (bed.equals("king bed") || bed.equals("queen bed") || bed.equals("single")) ) {
                System.err.println("Invalid entry, Which type of room do you want to book?");
                input.nextLine();
                bed = input.nextLine().toLowerCase();
            }

            switch (bed) {
                case "king bed":
                    System.out.println("King bed: 120$");
                    break;
                case "queen bed":
                    System.out.println("Queen bed: 100$");
                    break;
                case "single bed":
                    System.out.println("Single bed: 80$");
                    break;
            }


        } else if (answer.equals("no")) {
            System.out.println("Have a nice day!");
        }

        input.close();
    }

}
/*
 5. Create a class called RommReservation, write a program for the room reservation,
    your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve.
    	if user entered no, print "have a nice day"
    	(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */
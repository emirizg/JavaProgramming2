package day18_NestedLoop.tasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int total=0;

        System.out.println("Which bedroom do you want to reserve: ");
        String bedroom=scan.nextLine().toLowerCase();

        System.out.println("How many nights do you want to stay?");
        int nights=scan.nextInt();

        if (bedroom.equals("king bed")){
            total+= (nights*120);
        }else if (bedroom.equals("queen bed")) {
            total+= (nights*100);
        } else if (bedroom.equals("single bed")) {
            total+= (nights*80);
        }

        if (bedroom.equals("king bed")){
            System.out.println("King bed "+nights+" night costs "+total);
        } else if (bedroom.equals("queen bed")) {
            System.out.println("Queen bed "+nights+" night costs "+total);
        } else if (bedroom.equals("single bed")) {
            System.out.println("Single bed "+nights+" night costs "+total);
        }


        System.out.println("Would you like to reserve another room? : ");
        String answer=scan.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no")) ){

            System.err.println("Invalid entry, Would you like to reserve another room? : ");
            answer=scan.next().toLowerCase();


        }

        while (answer.equals("yes")) {

            total=0;
            scan.nextLine();
            System.out.println("Which bedroom do you want to reserve: ");
            bedroom = scan.nextLine().toLowerCase();

            System.out.println("How many nights do you want to stay?");
            nights = scan.nextInt();

            if (bedroom.equals("king bed")){
                total+= (nights*120);
            }else if (bedroom.equals("queen bed")) {
                total+= (nights*100);
            } else if (bedroom.equals("single bed")) {
                total+= (nights*80);
            }

            if (bedroom.equals("king bed")){
                System.out.println("King bed "+nights+" night costs "+total);
            } else if (bedroom.equals("queen bed")) {
                System.out.println("Queen bed "+nights+" night costs "+total);
            } else if (bedroom.equals("single bed")) {
                System.out.println("Single bed "+nights+" night costs "+total);
            }

            System.out.println("Would you like to reserve another room? : ");
            answer=scan.next().toLowerCase();

            if (answer.equals("no")){
                break;
            }

        }

        scan.close();

    }

}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
package day13_StringClass.tasks;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int total=0;

        System.out.println("Do you have a valid passport? ");
        String passport=input.next();

        if (passport.equals("yes")){

            total=1000;

            input.nextLine();
            System.out.println("Enter the country you travel to: ");
            String country=input.nextLine();

            System.out.println("How many bags you will take with you?");
            byte bag=input.nextByte();
            total=total+(bag*50);

            System.out.println("How many people you will travel with?");
            short people=input.nextShort();
            if (people>0 && people<=10) {
                if (people <= 3) {
                    total -= (people * 100);
                } else {
                    total -= 300;
                }
            }else {
                System.out.println("Invalid people number");
            }

            input.nextLine();

            System.out.println("Enter the name of the people they will travel with in one line separating with a comma");
            String names=input.nextLine();

            System.out.println("Your ticket is booked to "+country);
            System.out.println("We have charged extra for the "+bag+" but you are traveling with "+names+" so we are giving a discount.");
            System.out.println("Your total cost is "+total);

        }else {

            total=200;

            System.out.println("When your passport expired? ");
            int expired=input.nextInt();

            int year=2022-expired;
            total=total+(year*75);

            System.out.println("Which country you plan to travel?");
            String country=input.nextLine();

            System.out.println("Are you going to travel in the next year? ");
            String nextYear=input.next();

            if (nextYear.equals("yes")){
                total+=100;
            }else {
                total-=50;
            }

            System.out.println("Looks like your password has been expired for "+year);
            System.out.println("but not to worry we will get it ready for you to travel to "+country);
            System.out.println("Your total cost has come out to "+total);

        }




    }

}
/*
3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
            		separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName.
            		We have charged extra for the $numberOfBags bags but you are traveling
            		with $peopleYouTravelWith so we are giving a discount.
            		Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			but not to worry we will get it ready for you to travel to $allCountries.
        			Your total cost has come out to $costAmount."

 */
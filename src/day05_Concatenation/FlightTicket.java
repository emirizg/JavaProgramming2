package day05_Concatenation;

public class FlightTicket {

    public static void main(String[] args){

        String from="Las Vegas";
        String to="McLean";
        double ticketPrice=425.5;

        String fullInfo="From "+from+" to "+to+" is $"+ticketPrice;

        System.out.println(fullInfo);

    }

}

/*
2.create a class named FlightTicket, and declare the following variables:
                1. from
                2. to
                3. ticketPrice

    use concatenation to display the full info of the ticket

    ex:
            From Las Vegas to McLean is $425.5
 */

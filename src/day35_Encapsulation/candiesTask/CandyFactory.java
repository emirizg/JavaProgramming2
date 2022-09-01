package day35_Encapsulation.candiesTask;

import java.util.ArrayList;

public class CandyFactory {

    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();

        candies.add( new Candy("M&M", 60, 1.5, false));
        candies.add( new Candy("M&M", 50, 0, false));
        candies.add( new Candy("M&M", 40, 2.5, false));
        candies.add( new Candy("M&M", 30, 3.5, false));
        candies.add( new Candy("M&M", 20, 2.75, false));

        for (Candy candy : candies) {
            System.out.println(candy.getBrand() + " : " + candy.getPrice() );
            System.out.println(candy);
        }


    }

}
/*
1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */
package day20_Arrays.classNotesTasks;

import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

//        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad" };

//        double[] prices = {99.99,   150.0,  9.99,   250.0 ,  439.50};

        String[] items=new String[5];
        double[] prices=new double[5];

        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < items.length; i++) {

            System.out.println("Enter an item:");
            String item=scan.nextLine();

            System.out.println("Enter item's price:");
            double price=scan.nextDouble();
            scan.nextLine();

            items[i]=item;
            prices[i]=price;

        }

        double total=0;

        for (int i = 0; i < prices.length; i++) {

            total+=prices[i];

        }

        for (int i = 0; i < items.length; i++) {

            System.out.println("ItemName: "+items[i]+" -- Price: $"+prices[i]);

        }

        System.out.println("Total price: "+total);


    }

}
/*
5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */
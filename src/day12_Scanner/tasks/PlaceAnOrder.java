package day12_Scanner.tasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the product name: ");
        String productName=input.nextLine();

        System.out.print("Enter the price: ");
        double price=input.nextDouble();

        System.out.print("Enter the quantify: ");
        int quantify= input.nextInt();;

        System.out.print("Enter the first name: ");
        String firstName=input.next();

        double total=price*quantify;

        System.out.println(firstName+", your order for "+quantify+" "+productName+" has been places. Your total is "+total);

        input.close();
    }

}
/*
6. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.


 */
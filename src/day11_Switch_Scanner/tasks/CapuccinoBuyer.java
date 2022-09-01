package day11_Switch_Scanner.tasks;

public class CapuccinoBuyer {

    public static void main(String[] args) {

        String size="grande"; // tall, grande, venti
        double price;
        int calories;
        String result="";

        if (size=="tall"){
            price=3.69;
            calories=90;
            result="price is $"+price+"\n"+calories+" calories";
        } else if (size == "grande") {
            price=3.99;
            calories=120;
            result="price is $"+price+"\n"+calories+" calories";
        } else if (size == "venti") {
            price=4.29;
            calories=150;
            result="price is $"+price+"\n"+calories+" calories";
        }else {
            result="Invalid Size";
        }

        System.out.println(result);

        System.out.println("-----------------------------------------");

        switch (size){

            case "tall":
                price=3.69;
                calories=90;
                result="price is $"+price+"\n"+calories+" calories";
                break;
            case "grande":
                price=3.99;
                calories=120;
                result="price is $"+price+"\n"+calories+" calories";
                break;
            case "venti":
                price=4.29;
                calories=150;
                result="price is $"+price+"\n"+calories+" calories";
                break;
            default:
                result="Invalid size";
        }
        System.out.println(result);


        System.out.println("-----------------------------------------");


        if (size =="tall" || size=="grande" || size=="venti"){

            switch (size){

                case "tall":
                    price=3.69;
                    calories=90;
                    result="price is $"+price+"\n"+calories+" calories";
                    break;
                case "grande":
                    price=3.99;
                    calories=120;
                    result="price is $"+price+"\n"+calories+" calories";
                    break;
                case "venti":
                    price=4.29;
                    calories=150;
                    result="price is $"+price+"\n"+calories+" calories";
                    break;
                default:
                    result="Invalid size";
            }

        }

        System.out.println(result);

    }

}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program
   that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 3: use if & switch statements mixed
 */
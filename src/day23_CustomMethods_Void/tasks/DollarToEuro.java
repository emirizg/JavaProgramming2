package day23_CustomMethods_Void.tasks;

public class DollarToEuro {

    public static void main(String[] args) {

        dollarToEur(100);

    }

    public static void dollarToEur(int amount){

        double euro=0.96;

        double total=euro*amount;

        System.out.println(total);

    }

}
/*
9. create a method that can convert dollar to euro
 */

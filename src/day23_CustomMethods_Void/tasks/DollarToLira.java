package day23_CustomMethods_Void.tasks;

public class DollarToLira {

    public static void main(String[] args) {

        dollarToLira(300);

    }

    public static void dollarToLira(int dollar){

        double lira=16.62;

        double converted=lira*dollar;

        System.out.println(dollar+"$ : "+converted);

    }

}
/*
10. create a method that can can convert dollar to lira
 */

package day08_IfStatement;

public class EligibleForCigarettes {

    public static void main(String[] args){

        byte age=11;

        boolean isEligible= age >=21;

        if (isEligible){
            System.out.println("Eligible to buy Cigarettes");
        }
        if (!isEligible){
            System.out.println("NOT eligible to buy Cigarettes");
        }

    }

}
/*
	1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

 */
package day23_CustomMethods_Void.tasks;

public class Eligible {

    public static void main(String[] args) {

        checkEligible(22);

    }

    public static void checkEligible(int age){

        if (age>21){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("Not eligible");
        }

    }

}
/*
3. create a method that can check if a person is eligible to buy alcohol
 */
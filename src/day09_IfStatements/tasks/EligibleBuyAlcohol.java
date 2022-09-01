package day09_IfStatements.tasks;

public class EligibleBuyAlcohol {

    public static void main(String[] args) {

        String name="Dybala";
        byte age=4;

        boolean isEligible= age >= 21;

        if (isEligible){
            System.out.println(name+" is eligible to buy alcohol");
        }else {
            System.out.println(name+" is NOT eligible to buy alcohol");
        }

    }

}
// 		3. Write a progrm that can check if the person is eligible to buy alcohol

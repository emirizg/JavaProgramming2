package day23_CustomMethods_Void.tasks;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleVote(22,"USA");

    }

    public static void eligibleVote(int age,  String citizen){

        if (age > 21 && citizen.equals("USA")){

            System.out.println("You are eligible to vote");

        }else{
            System.out.println("You are not eligible to vote");
        }

    }


}
/*
4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */
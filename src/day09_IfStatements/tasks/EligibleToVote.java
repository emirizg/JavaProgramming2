package day09_IfStatements.tasks;

public class EligibleToVote {

    public static void main(String[] args) {

        String name="Dusan";
        String citizen="USA";
        byte age = 29;

        boolean isEligibleToVote = age >= 21 && citizen == "USA";

        if (isEligibleToVote){
            System.out.println(name+" is eligible to vote.");
        }else{
            System.out.println(name+" is NOT eligible to vote.");
        }

    }

}

// 		4. Write a progrm that can check if the person is eligible to vote
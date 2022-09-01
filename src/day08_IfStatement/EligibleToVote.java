package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name="Josh";
        int age=38;
        String citizen="USA";

        boolean isEligble= age>=21 && citizen=="USA";

        // Eligible
        if(isEligble){ // true
            System.out.println(name+" is eligible to vote.");
        }

        // Not eligible
        if (!isEligble){ // !True ==> not true==> false
            System.out.println(name+" is not eligible to vote.");
        }

    }

}

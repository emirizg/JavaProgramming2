package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        /*
        Switch is more faster
        - in the default block you dont have any value
         */
        char ch='F'; // ==
        String result="";

        switch(ch){

            case 'A': // this is a case block
                result="Excellent";
                break;
            case 'B':
                result="Great Job";
                break;
            case 'C':
                result="Good";
                break;
            case 'D':
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                result="Invalid";

        }

        System.out.println(result);

    }

}
/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */
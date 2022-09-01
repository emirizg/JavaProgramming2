package day11_Switch_Scanner.tasks;

public class GradeLevel {

    public static void main(String[] args) {

        char ch='C';

        String gradeLevel="";

        switch(ch){

            case 'A':
                gradeLevel="Excellent";
                break;
            case 'B':
                gradeLevel="Great Job";
                break;
            case 'C':
                gradeLevel="Good";
                break;
            case 'D':
                gradeLevel="Passed";
                break;
            case 'F':
                gradeLevel="Failed";
                break;
            default:
                gradeLevel="Invalid";

        }

        System.out.println(gradeLevel);

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

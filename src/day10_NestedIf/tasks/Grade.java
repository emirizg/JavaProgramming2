package day10_NestedIf.tasks;

public class Grade {

    public static void main(String[] args) {

        char ch='K'; // A,B,C,D,F
        String grade="";
        boolean isValid=ch=='A' || ch=='B' || ch=='C' ||ch=='D' ||ch=='F';

        if (isValid){

            if (ch=='A'){
                grade="Excellent";
            } else if (ch == 'B') {
                grade="Great Job";
            } else if (ch == 'C') {
                grade="Good";
            } else if (ch == 'D') {
                grade="Passed";
            } else {
                grade="Failed";
            }

        }else {
            grade="Invalid";
        }

        System.out.println(grade);
    }

}
/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
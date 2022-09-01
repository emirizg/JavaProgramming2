package day10_NestedIf.tasks;

public class GradeLevel {

    public static void main(String[] args) {

        byte number=102
                ; // 1~18
        String gradeLevel="";

        boolean isValid= number >= 1 && number <= 18;

        if (isValid){

            if (number<=5 && number>=1){
                gradeLevel="Elementary School";
            }else if (number>=6 && number<=8){
                gradeLevel="Middle School";
            } else if (number >= 9 && number <= 12) {
                gradeLevel="High School";
            } else if (number >= 13 && number <= 16) {
                gradeLevel="College";
            }else {
                gradeLevel="Grade School";
            }

        }else{
            gradeLevel="Invalid grade level given";
        }

        System.out.println(gradeLevel);
    }

}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */

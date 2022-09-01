package day12_Scanner.tasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score=scan.nextInt();

        if (score>=90 && score<=100){
            System.out.println("A");
        } else if (score >= 80 && score<=89) {
            System.out.println("B");
        } else if (score >= 70&& score<=79) {
            System.out.println("C");
        } else if (score >= 60 && score<=69) {
            System.out.println("D");
        } else if (score >= 0&& score<=59) {
            System.out.println("F");
        }else {
            System.out.println("Invalid Score");
        }
scan.close();
    }

}
/*
 2. GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

            90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
     0 ~ 59 ==> F
 */
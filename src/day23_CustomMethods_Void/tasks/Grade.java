package day23_CustomMethods_Void.tasks;

public class Grade {

    public static void main(String[] args) {

        grade(44);

    }

    public static void grade(int score){

        String grade="";

        if (score>0 && score<101) {
            grade = (score >= 90) ? "A" : (score >= 80) ? "B" :(score>=70)?"C" :(score>=60)?"D": "F";
        }else {
            grade="Invalid";
        }

        System.out.println(grade);
    }

}
/*
5. create a method that can calculate the grade of the student based on the score

            'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */
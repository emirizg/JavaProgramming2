package day20_Arrays.tasks;

import java.util.Arrays;

public class Grade {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {

            int score=scores[i];
            char grade=grades[i];

            if (score>=90){
                grade='A';
            } else if (score >= 80 && score < 90) {
                grade='B';
            } else if (score >= 70 && score < 80) {
                grade='C';
            }

            grades[i]=grade;
        }

        System.out.println(Arrays.toString(grades));

        for (int i = 0; i < names.length; i++) {

            String name=names[i];
            int score=scores[i];
            char grade=grades[i];

            System.out.println(name+"'s score is "+score+", and grade is "+grade);

        }

    }

}
/*

4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A

 */
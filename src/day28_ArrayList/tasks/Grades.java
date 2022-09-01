package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Grades {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (int each : scores){

            if (each>=90 && each <= 100){
                gradeOfA.add(each);
            } else if (each >= 80 && each <= 89) {
                gradeOfB.add(each);
            }else if (each >= 70 && each <= 79) {
                gradeOfC.add(each);
            }else if (each >= 60 && each <= 69) {
                gradeOfD.add(each);
            }else if (each >= 0 && each <= 59) {
                gradeOfF.add(each);
            }

        }

        System.out.println("gradeOfA.size() = " + gradeOfA.size());
        System.out.println("gradeOfB.size() = " + gradeOfB.size());
        System.out.println("gradeOfC.size() = " + gradeOfC.size());
        System.out.println("gradeOfD.size() = " + gradeOfD.size());
        System.out.println("gradeOfF.size() = " + gradeOfF.size());

    }

}
/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
 */
package day16_ForLoopStringPractice.tasks;

public class CatDog {

    public static void main(String[] args) {

        String sentence = "caT cat dogG cAt dog DOG";

        int dogCount=0;
        int catCount=0;

        for (int i=0;i<sentence.length()-2;i++){

            String str=sentence.substring(i,i+3);

            if (str.equalsIgnoreCase("cat")){
                catCount++;
            }
            if (str.equalsIgnoreCase("dog")){
                dogCount++;
            }

        }

        boolean result=catCount==dogCount;

        System.out.println("result = " + result);

    }

}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */
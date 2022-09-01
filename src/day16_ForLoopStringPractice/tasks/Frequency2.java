package day16_ForLoopStringPractice.tasks;

public class Frequency2 {

    public static void main(String[] args) {

        String sentence = "Java Java";

        int counter = 0;


        for (int i = 0; i < sentence.length() - 3; i++) { // Java have 4 char last 3 char we don't need to check therefore we did -3
            String str = sentence.substring(i, i + 4);
            if (str.equals("Java")) {
                counter++;
            }

        }
        System.out.println("counter = " + counter);
    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */
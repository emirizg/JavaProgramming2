package day16_ForLoopStringPractice.tasks;

public class Frequency3 {

    public static void main(String[] args) {

        String sentence = "Java Java";

        int counter=0;

        for (int i=0;i<=sentence.length()-4;i++){

            String eachSub=sentence.substring(i,i+4);

            if (eachSub.equals("Java")){
                counter++;
            }

        }
        System.out.println(counter);
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
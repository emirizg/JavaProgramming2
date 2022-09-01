package day21_ForEachLoop.tasks;

import java.util.Arrays;

public class AnywhereJava {

    public static void main(String[] args) {

        String sentence = "python java python python java python java";
        String[] words=sentence.split(" ");

        int javaCount=0;
        int pythonCount=0;

        for( String word : words ){

            if (word.equalsIgnoreCase("java")){
                javaCount++;
            } else if (word.equalsIgnoreCase("python")) {
                pythonCount++;
            }
        }

        System.out.println("Java appearances: "+javaCount);
        System.out.println("Python appearances: "+pythonCount);
    }

}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

 */


/*
String str = "java java python python java python";
int frequency = 0;

        for (int i = 0; i < str.length() - 3; i++) { // i: 1,2,3,4,5,6,7 --> i<=str.length()-4 || i<str.length()-3

            String eachSub = str.substring(i, i + 4); // if the last index is 7 you can give 8

            if (eachSub.equalsIgnoreCase("java")) {
                frequency++;
            }

        }

        int freq = 0;
        for (int i = 0; i < str.length() - 5; i++) { // i: 1,2,3,4,5,6,7 --> i<=str.length()-4 || i<str.length()-3

            String eachSub = str.substring(i, i + 6); // if the last index is 7 you can give 8

            if (eachSub.equalsIgnoreCase("python")) {
                freq++;
            }

        }

        System.out.println("Java appearances: "+frequency);
        System.out.println("Python appearances: "+freq);
 */
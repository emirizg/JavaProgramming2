package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str="JavaJavaJavaJava";

        int frequency=0;

        for (int i=0;i<str.length()-3;i++){ // i: 1,2,3,4,5,6,7 --> i<=str.length()-4 || i<str.length()-3

            String eachSub=str.substring(i,i+4); // if the last index is 7 you can give 8

            if (eachSub.equalsIgnoreCase("java")){
                frequency++;
            }

        }

        System.out.println(frequency);
    }

}
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */
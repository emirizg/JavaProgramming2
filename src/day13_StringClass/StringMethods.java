package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(3);
        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar= word.charAt(9); // String index out of range: 9
        System.out.println("tenthChar = " + tenthChar);

        - When we use charAt(); --> method the index number must be exist
        - Every single String has a length,
        - it is going to return you the total number of the characters that you have in the String.>returns int<
         */

        System.out.println("---------------------");

        String s1 = "Batch 25 is the best Batch"; // anything you within the double quote is a character

        int totalCharacters = s1.length();
        System.out.println("totalCharacters = " + totalCharacters);

       // char lastChar= s1.charAt(totalCharacters-1);

        char lastChar= s1.charAt( s1.length()-1 ); // last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("---------------------");

        String str="Wooden Spoon";
        str= str.toUpperCase(); // "WOODEN SPOON"

        System.out.println("str = " + str);

        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);

    }

}

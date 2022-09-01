package week05;

public class Palindrome {

    public static void main(String[] args) {

        // what is palindrome?   "madam" when you reverse : "madam" again ||  KAYAK is palindrome, noon: palindrome PIQ for JAVA
        // check for 5 characters word, and without methods that we did not learn

        String word="madam";

        /*
        how can I reserve a string in java?
        strings are indexed based : 0-1-2-3-4-5
        when reversed : 4-3-2-1-0

        to get one Char from an index of a String: charAt() method: accepts an index(int) as parameter and returns char
         */

        // create an empty container for my result

        word=word.toLowerCase(); // to make our result of the tas case insensitive
        String result= "";
        result+=word.charAt(4);
        result+=word.charAt(3);
        result+=word.charAt(2);
        result+=word.charAt(1);
        result+=word.charAt(0);

        if (word.equals(result)){
            System.out.println("They are Palindrome");
        }

        // another solution
        String str = "kazak";
        if (str.charAt(0)==str.charAt(4)&&str.charAt(1)==str.charAt(3))
            System.out.println("Palindrome");


    }

}

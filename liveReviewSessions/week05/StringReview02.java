package week05;

public class StringReview02 {

    public static void main(String[] args) {

        /*
        length --> no parameter ---- returns int
        toUpperCase() or toLowerCase() --> no parameter --- returns the same string in uppercose or lowercase letter
         */

        String message="EU9 is doing so great!!";

        int count=message.length();

        /*
        message.lemgth(); it is very useful to create Loops that involves String, for getting size
         */

        System.out.println(message.toUpperCase());
        /*
        message.toUpperCase() --> a new string created in the string pool,
        however 'message' my object reference is still pointing to the old object(original)
         */
        System.out.println(message);

        message=message.toUpperCase();

        System.out.println(message);


    }

}

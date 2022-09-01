package week05;

public class DynamicSubstring {

    public static void main(String[] args) {

        String searchResult="result count:34521";

        System.out.println(searchResult.length()); // last index index then 18-1=17
        // just taking numbers with substring
        String numbers =searchResult.substring(13);// when you give begining index takes the rest of string
        System.out.println("numbers = " + numbers);

        /*
        instead of static way: indexOf() method --> takes a string/char from you as parameter, returns the index
         */

        int coloumnIndex=searchResult.indexOf(':');
        System.out.println("coloumnIndex = " + coloumnIndex);

        String numbersNew=searchResult.substring(coloumnIndex+1);
        System.out.println(numbersNew.equals(numbers));

        String searchResultNew=" username:oscar search result count: 12345 more column : more information ";

    }

}

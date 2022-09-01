package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        // substring(beginning index, ending index) --> when you want some portion of the string you need to use it
        // ending index will always be excluded

        String word="Cydeo School";
        //           012345...

        String brand=word.substring(0,4+1);
        System.out.println("brand = " + brand);

        String str1=word.substring(6);
        System.out.println("str1 = " + str1);

        String word2="Python C# Ruby";

        String s1= word2.substring(0,word2.indexOf(" ")); // "Java"
        String s2=word2.substring( word2.indexOf(" ")+1 , word2.lastIndexOf(" ")); // "Programming"
        String s3= word2.substring(word2.lastIndexOf(" ") + 1 ); // "Language"

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

    }

}

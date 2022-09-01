package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str= "       ";

        boolean r=str.isEmpty();

        System.out.println(r);

        boolean r1=str.isBlank();

        System.out.println(r1);

        String  str2="Cydeo   ";
        System.out.println(str2.isBlank());

        System.out.println("--------------------------------");


        String s1="CYDEO";
        String s2="cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("yEs".equalsIgnoreCase("yes"));

        System.out.println("--------------------------------");

        // equals it is going to compare entire text

        String sentence= "My favorite programming language is Java";
        boolean  hasCSharp=sentence.contains("C#");
        boolean  hasJava=sentence.contains("Java");
        boolean  hasJava2=sentence.contains("java");
        boolean hasJava3=sentence.toLowerCase().contains("java");
        boolean r3=sentence.contains("Java") || sentence.contains("java");

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);

        System.out.println("--------------------------------");
        /*
        - equals() method it is comparing how many characters you have in those 2 string
        - in order for equals method to return true total number of the characters of those 2 string has to be same
        - if total number of the characters are not same then there is no way to get true
        - they need to have same length and same characters
         */

        String input1="I love Java";
        String input2="Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false

        System.out.println(input1.contains("Java")); // true

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("--------------------------------");

        String a="Wooden Spoon";

        boolean x= a.startsWith("Woo"); // you can give more than one characters
        boolean y=a.endsWith("Spoon");
        boolean z=a.toLowerCase().startsWith("wooden");
        /* in order to ignore case sensitivity we first create the lower case version of string
         and then compare it with lowercase
         */

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}

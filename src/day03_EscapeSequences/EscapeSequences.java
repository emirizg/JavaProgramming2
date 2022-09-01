package day03_EscapeSequences;

/*
Escape sequences: Must be given with double quote
                 \n --> starts a new line
                 \t --> paragraph space - tab
                 \\ --> single back slash
                 \" --> double quote
                 double quote in java is reserved for string
 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("-----------------------------------");

        System.out.println("Hello Cydeo! \nHow are you all? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("-----------------------------------");

        System.out.println("\tJava is cool Programming Language");

        System.out.println("-----------------------------------");

        System.out.println("/ \\\\\\"); // in order to print one backward slash we need to give two backward slashes

        System.out.println("-----------------------------------");

        System.out.println("My favorite TV show is \"Game Of Throne\"");

    }

}

package day18_NestedLoop.tasks;

public class UniqueChar {

    public static void main(String[] args) {

        String str = "aabccdeegjjflf";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int counter=0;
            char ch=str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                char each=str.charAt(j);

                if (ch==each){
                    counter++;
                }



            }

            if (counter==1){
                result+=ch;
            }


        }

        System.out.println(result);

    }

}
/*
5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

   Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters
             to find the frequency.
            		if frequency of a character == 1  =========> unique
 */
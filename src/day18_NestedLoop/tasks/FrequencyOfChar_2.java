package day18_NestedLoop.tasks;

public class FrequencyOfChar_2 {

    public static void main(String[] args) {

        String str = "aabcccd";
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

            if (result.contains(""+ch)){
                continue;
            }

            result+=ch;
            result+=counter;

        }

        System.out.println(result);

    }

}
/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

       Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */
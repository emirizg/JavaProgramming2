package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%Woo)?^52denSpoon";
        String letters = "",
                digits = "",
                specialChars = "";

        for (int i = 0; i <= str.length() - 1; i++) { //i: index numbers of str(0~ last index)

            char ch = str.charAt(i); //ch: each character that we have in str
            boolean isDigit = ch >= 48 && ch <= 57;
            boolean isLetter = (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);

            if (isDigit) { // if the character is between '0' to '9' then it's digit
                digits += str.charAt(i);
            } else if (isLetter) { // if the charcater is between 'A' to 'Z' and 'a' to 'z' then it's letter
                letters += str.charAt(i);
            } else { // if the character is neither digit nor letter, then it's special character

                if (ch != ' ') { // if the special character is not a space
                    specialChars += str.charAt(i);
                }

            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }

}
/*
5. write a program that can restive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
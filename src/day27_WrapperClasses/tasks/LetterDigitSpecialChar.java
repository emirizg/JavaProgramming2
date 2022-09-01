package day27_WrapperClasses.tasks;

public class LetterDigitSpecialChar {

    public static void main(String[] args) {

        String str="Wooden Spoon!";

        String letters="",
                digits="",
                specialChars="";

        char[] ch=str.toCharArray();

        for (char each: ch){

            if (Character.isLetter(each)){
                letters+= each;
            } else if (Character.isDigit(each)) {
                digits+= each;
            }else {
                specialChars+=each;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }

}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */
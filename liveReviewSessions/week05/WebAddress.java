package week05;

import java.util.Scanner;

public class WebAddress {

    public static void main(String[] args) {

        /*
        Create a class named WebAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
         */

        // to get user input
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter a valid website : such as www.amazon.com");

        String userEntry=scanner.next();
        //www.amazon.com
        int indexOfFirstDot=userEntry.indexOf('.');
       // int indexOfSecondDot=userEntry.indexOf('.',indexOfFirstDot);
        int indexOfSecondDot=userEntry.lastIndexOf('.');

        String beginning =userEntry.substring(0,indexOfFirstDot);
        String endingOfUrl=userEntry.substring(indexOfSecondDot+1);

    }

}

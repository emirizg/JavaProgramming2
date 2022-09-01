package day12_Scanner;

 // import java.util.*; // wild import
 // * -> it is going to import everything in the util package, imports everything from the package
 // you need to import what you need

import java.util.Scanner; // regular import: imports one class, just do not import all of them, if you don't need all of them

public class ScannerPractice {

    /*
  -  Scanner Class: used for getting user inputs
  -  needs to be imported from "java.util"
  -  syntax of import statement   ---> import package.class;   ---> import java.util.Scanner;
  -  Declare :   Scanner variableName(i can only store scanners in this variable) = new Scanner(Sytem.in);
  -  Every time we use "new" keyword it means we are creating an object in java
  -  in java every single constructor they have the same name with the class name
  -  variable it makes the data reusable

  -- Methods -- method that you are using it is going to determine  what kinf of input the user can provide
  -  nextInt() --> Returns input as an int
  -  if you are calling methods of the Scanner make sure that you are calling from the Scanner's object
  -  nextDouble() -->
  -  nextLong() -->
  -  nextBoolean() -->
  -  next() -->
  -  nextLine() -->
     */

    // local variables ---> variable that is declared within the block of a mathod

    public static void main(String[] args) {


        //  int num=new Scanner(System.in).nextInt();
       Scanner scan= new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7:");
        int num=scan.nextInt();

        String result="";

        if (num >= 1 && num <= 7){

           result= (num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday"
                   :(num==5)?"Friday":(num==6)?"Saturday":"Sunday";

        }else{
            result="Invalid Number";
        }

        System.out.println(result);

        scan.close();

    }

}

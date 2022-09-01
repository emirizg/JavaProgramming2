package day11_Switch_Scanner;

public class DaysInWeek_Switch {

    public static void main(String[] args) {

        /*
        if (number == 1){
            System.out.println("Monday");
        }
         */
        /*
      -   Every case value it has to be unique, it must be unique all the time
      -   it has the colon >>>> case: <<<<<
      -   if you dont exit the case block, the next case block may get executed, so make sure that you give the break
      -   make sure how to create case block
      -   in the case block you can do anything want you want
      -   the switch statement you will only use it if you have a data you need to compare with other datas to see
          they are equal or not
      -   if statement is very powerful
      -   default is not mandatory
      -   in the last block you don't need to give break;
      -   nothing is mandatory in switch statement
      -   default only gets executed if none of the case blocks are matching
      -   default prefered way at the very end
      -   in the switch you can only have one default statement
      -   in the default block you dont have any value
      -   there is no order in the switch statement
      -   anything you return a boolean u can not use it

      -   Case value must match with switch' data type and UNIQUE
      -   Switch' data can not be long,float,double and boolean data types
      -   break: used for exiting the switch, if we don't give the break statement, the next block gets executed,
                  switch statement continue to execute the next block(s) until the break statement or } of the switch
      -   default block gets executed if none of the case blocks matched,  there can only be one default block
      -   || logic we can use it in switch by declaring case blocks back to back

         */

        /*
        switch (expression) {

              case data1:
                   statements;
                   break;

              case data2:
                   statements;
                   break;

            }

         long number = 9L;
         float number = 9L;
         double number = 9L;
         boolean number = true;
        */


        int number=9;
        String nameOfDay="";

        switch (number){ //1,2,3,4,5,6,7  ==

            case 1:
                nameOfDay="Monday";
                break; // exits the switch after executing the case block
            case 2:
                nameOfDay="Tuesday";
                break; // exits the switch after executing the case block
            case 3:
                nameOfDay="Wednesday";
                break; // exits the switch after executing the case block
            case 4:
                nameOfDay="Thursday";
                break; // exits the switch after executing the case block
            case 5:
                nameOfDay="Friday";
                break; // exits the switch after executing the case block
            case 6:
                nameOfDay="Saturday";
                break; // exits the switch after executing the case block
            case 7:
                nameOfDay="Sunday";
                break; // exits the switch after executing the case block
            default:
                nameOfDay="Invalid number";
                // we don't need to give break statement for the last block of the switch in order to exit the switch

        }

        System.out.println(nameOfDay);


    }

}

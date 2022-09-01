package day24_CustomMethod_Return;

public class ReturnStatement {

    /*
    - you can use return; in void method only for exiting, it terminates the method
    - You can use return; keyword in void method

     */

    public static void main(String[] args) {

        nameOfDay(1);

    }

    // Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

        if (number<1 || number>7){ // if the number is invalid
            System.err.println("Invalid");
            return; // exits nameOfDay method, it terminates this method

        }

        if (number==1){
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        }else if (number == 4) {
            System.out.println("Thursday");
        }else if (number == 5) {
            System.out.println("Friday");
        }else if (number == 6) {
            System.out.println("Saturday");
        }else {
            System.out.println("Sunday");
        }



    }


}

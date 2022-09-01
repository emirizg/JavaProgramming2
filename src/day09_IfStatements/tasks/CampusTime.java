package day09_IfStatements.tasks;

public class CampusTime {

    public static void main(String[] args) {

        int number= 3; // 1~24

        boolean isOpen= number >=8 && number<=23;

        if (isOpen){
            System.out.println("open");
        }else {
            System.out.println("closed");
        }

    }

}

/*
1.  Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been initialized,
write a program that can find out if the campus is open or not.
Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message:
“open”  but if the time entered is outside of operating hours they should see: “ closed”

 */
package day24_CustomMethod_Return;

public class BreakFastTasks {

    public static void main(String[] args) {

        initials("wooden","spoon");

        System.out.println("--------------------------------");

        domain("cydeo@gmail.com");

        System.out.println("--------------------------------");

        String[] emails={"josh@gmail.com","Jim@yahoo.com","Elminur@cydeo.com","Gulsen@gmail.com"};


        for (String email : emails) {
            domain(email);
        }

        System.out.println("--------------------------------");

        nameOfMonth(4);

        System.out.println("--------------------------------");

        nameOfDay(10);


    }

    // 1. Create a method that can display the initials of the person --> initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){

        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println("initial = " + initial.toUpperCase());

    }

    // 2. Create a method that can display the domain of the email --> domain(String email){body}
    public static void domain(String email){

        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain = " + domain);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        String name="";
        if (number>=1 && number<=12){

            name= (number== 1)?"January" : (number==2)?"February" : (number==3)?"March": (number==4)?"April"
                    : (number==5)?"May": (number==6)?"June": (number==7)?"July": (number==8)?"August"
                    : (number==9)?"September": (number==10)?"October": (number==11)?"November" : "December";

        }else {
            name="Invalid";
        }
        System.out.println("Month name = " + name);
    }

    // 4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

        if (!(number<1 || number>7)) { // if the number is invalid

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        }else {
            System.err.println("Invalid");

        }

    }

    // 5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){



    }



}
/*
1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

	6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
 */
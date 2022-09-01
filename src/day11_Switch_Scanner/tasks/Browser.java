package day11_Switch_Scanner.tasks;

public class Browser {

    public static void main(String[] args) {

        String browserName="firefox"; // chrome, firefox, opera, safari, edge

        switch (browserName){

            case "chrome":
                System.out.println("Chrome is selected");
                break;
            case "firefox":
                System.out.println("Firefox is selected");
                break;
            case "opera":
                System.out.println("Opera is selected");
                break;
            case "safari":
                System.out.println("Safari is selected");
                break;
            case "edge":
                System.out.println("Edge is selected");
                break;
            default:
                System.out.println("Invalid Browser");

        }

    }

}

/*

	3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */
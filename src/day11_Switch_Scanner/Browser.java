package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        String browserName= "Safari";
        String result="";

        if (browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera" ||
                browserName == "Safari" || browserName == "Edge"){

            if (browserName=="Chrome"){
                result= "Chrome Browser is selected";
            } else if (browserName == "Firefox") {
                result="Firefox Browser is selected";
            } else if (browserName=="Opera") {
                result="Opera Browser is selected";
            } else if (browserName == "Safari") {
                result="Safari Browser is selected";
            }else {
                result="Edge Browser is selected";
            }

        }else {
            result="Invalid Browser Name";
        }

        System.out.println(result);

    }

}

/*
1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if
 */
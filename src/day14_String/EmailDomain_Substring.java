package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email= "Cydeo.School@gmail.com";

        // domain:
        int beginingIndex= email.indexOf("@") +1;
        int endingIndex= email.lastIndexOf(".");

        String domain= email.substring(beginingIndex,endingIndex);
        System.out.println("domain = " + domain);

        System.out.println("----------------------------");

        String str1= "Java is fun, Java is cool";

        //
        String s1= str1.substring(0,10+1) ; // java is fun

        int beg=str1.lastIndexOf("J");

        String s2=str1.substring(beg);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


    }

}
/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)
		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail

			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */
package day09_IfStatements.tasks;

public class EqualNumbers {

    public static void main(String[] args) {

        int n1=9,
                n2=5,
                n3=9;

        boolean allEqual= n1 == n2 && n1 == n3 && n2 == n3; //if all are equal ==> print "all equal"
        boolean n1_n2Equal = n1 == n2 && n1 != n3 && n2 != n3; // if only n1 and n2 are equal
        boolean n2_n3Equal = n2 == n3 && n2 != n1 && n3 != n1; // if only n2 and n3 are equal
        boolean n3_n1Equal = n3 == n1 && n3 != n2 && n1 != n2; // if only n3 and n1 are equal

        if (allEqual){
            System.out.println("All equal");
        } else if (n1_n2Equal) {
            System.out.println("n1&n2 are equal");
        } else if (n2_n3Equal) {
            System.out.println("n2&n3 are equal");
        } else if (n3_n1Equal) {
            System.out.println("n3&n1 are equal");
        } else {
            System.out.println("None of them are equal");
        }

    }

}
/*
6. Create a class called EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are equal ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
 */
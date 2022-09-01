package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a=10,b=1,c=20;
        // if we have three different numbers, one MUST be maximum, one MUST be minimum and one MUST be Median

        boolean isAMedian= (a<c&&a>b) || (a<b&&a>c);
         /*
            in order for a to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
             */
        boolean isBMedian= (b<c&&b>a) || (b<a&&b>c);
        /*
            in order for b to be the median number:
                   1. if c is the maximum number & a is the minimum number, then b is the median number
                   2. if a is the maximum number & c is the minimum number, then b is the median number
         */
        boolean isCMedian= (c<a&&c>b) || (c<b&&c>a);
       // boolean isCMedian= !isAMedian && isBMedian;
        /*
             in order for c to be the median number
                  1. if a is the maximum number & b is the minimum number, then c is the median number
                  2. if b is the maximum number & a is the minimum number, then c is the median number
         */

        if (isAMedian){ // if a is the median number
            System.out.println(a+" could be median number.");
        }
        if (isBMedian){ // if b the median number
            System.out.println(b+" could be median number.");
        }
        if (isCMedian){ // if c the median number
            System.out.println(c+" could be median number.");
        }

    }

}
/*

	2. Create a class called MedianNumber.
	write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number

			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */
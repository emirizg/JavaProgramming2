package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        /*
        - for each loop --> a loop that's already iterated.
        - iteration starts from index 0
        pre-condition --> there MUST be a data structure
         */

        int[] numbers={10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement=numbers[i];
            System.out.println(eachElement);
        }

        System.out.println("-------------------------------------------");

        // for each loop

        for ( int each : numbers ){  // each elements of the array
            System.out.println(each);
        }




    }

}

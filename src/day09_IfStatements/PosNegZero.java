package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n=43;

        if (n>0){
            System.out.println("Positive");
        }

        if (n<0) {
            System.out.println("Negaive");
        }

        if(n==0){
            System.out.println("Zero");
        }

        System.out.println("--------------------------------");

        boolean positive=n>0;
        boolean negative=n<0;
        boolean zero= !positive && !negative;
        // boolean zero = n==0;

        if (positive){
            System.out.println("Positive");
        }else if (negative) {
            System.out.println("Negaive");
        }else{
            System.out.println("Zero");
        }

        System.out.println("--------------------------------");

        if (positive){
            System.out.println("Positive");
        }

        if (negative){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
        // if & else statment we can NEVER apply for the tasks that requires more than two condition!!

    }

}

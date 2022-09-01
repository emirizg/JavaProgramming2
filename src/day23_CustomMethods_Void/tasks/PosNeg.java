package day23_CustomMethods_Void.tasks;

public class PosNeg {

    public static void main(String[] args) {

        psNgZr(8761);

    }

    public static void psNgZr(int num){

        if (num>0){
            System.out.println("Positive");
        } else if (num == 0) {
            System.out.println("Zero");
        }else {
            System.out.println("Negative");
        }

    }

}
/*
	12. create a method that can if the given integer is positive, negative or zero

 */
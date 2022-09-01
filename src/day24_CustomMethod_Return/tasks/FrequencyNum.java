package day24_CustomMethod_Return.tasks;

public class FrequencyNum {

    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};

        int result=frequency(array, 1);

        System.out.println(result);
    }

    public static int frequency(int[] arr,int num){

        int counter=0;

        for (int i : arr) {

            if (i==num){
                counter++;
            }

        }

        return counter;
    }


}
/*
 5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */
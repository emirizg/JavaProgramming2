package day21_ForEachLoop.tasks;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1= {1,2,3,4,5};
        int[] arr2= {4,5,6,7,8};

        String result="";

        for(int i:arr1){

            for (int j:arr2){

                if (i==j){
                    result+=i+" ";
                }

            }

        }

        System.out.println(result);

    }

}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

          MUST use for each loops
 */
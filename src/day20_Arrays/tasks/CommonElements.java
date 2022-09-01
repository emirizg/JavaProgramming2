package day20_Arrays.tasks;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};

        String result="";

        for (int i = 0; i < arr1.length; i++) {

            int nm=arr1[i];

            for (int j = 0; j < arr1.length; j++) {

                int each=arr2[j];

                if (nm==each){
                    result+=nm+" ";
                }

            }

        }


        System.out.println(result);
    }

}
/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */
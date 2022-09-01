package day24_CustomMethod_Return.tasks;

public class Contains {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int num = 10;

        boolean result=isContains(arr,num);

        System.out.println(result);

    }

    public static boolean isContains(int[] arr1,int num){

        boolean contains=false;

        for (int elements: arr1){

            if (elements==num){
                contains=true;
            }

        }

        return contains;

    }

}
/*
	9. Create a method named contains that passes one integer array and one integer parameters,
	the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					int[] arr = {1,2,3,4,5,6,7};
					int num = 10;

					contains(arr, num) ===> false

 */
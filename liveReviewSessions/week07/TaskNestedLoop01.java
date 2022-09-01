package week07;

public class TaskNestedLoop01 {

    public static void main(String[] args) {

        int rowCount=5;

        for (int row = 0; row <= rowCount ; row++) {

            int value =row;

            for (int col = 1; col <=row ; col++) {

                System.out.print(value+" ");
                value+=rowCount-col;

            }
            System.out.println();
        }

    }

}
/*
    1
    2  6
    3  7  10
    4  8  11  13
    5  9  12  14  15

    What is repeating?
    how is it repeating?
   */

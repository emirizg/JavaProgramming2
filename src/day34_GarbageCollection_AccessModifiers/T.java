package day34_GarbageCollection_AccessModifiers;

public class T {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i == j) {
                    continue;
                }
                System.out.print(i + " " + j + " ");
            }
        }

    }

}

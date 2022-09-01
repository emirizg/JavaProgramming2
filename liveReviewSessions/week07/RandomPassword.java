package week07;

import java.util.Random;

public class RandomPassword {

    public static void main(String[] args) {

        String source ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";

        /*
        create a loop that will generate 8 character password randomly
         */

        Random random=new Random();
        int randomIndex=random.nextInt(source.length());

        System.out.println("randomIndex = "+randomIndex);

    }

}

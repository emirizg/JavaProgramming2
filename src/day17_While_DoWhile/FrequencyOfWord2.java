package day17_While_DoWhile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String str = "caT dog dogG cAt";
        int countDog = 0;
        int countCat = 0;

        for(int i= 0 ; i <= str.length()-3; i++){ //i:0 , 1, 2,3, 4

            String s = str.substring(i, i+3);
            if(s.equalsIgnoreCase("dog")){
                countDog++;
            }

            if(s.equalsIgnoreCase("cat")){
                countCat++;
            }

        }

        boolean result = countCat == countDog;

        System.out.println(result);



    }

}

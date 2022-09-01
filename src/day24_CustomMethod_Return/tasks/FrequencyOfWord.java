package day24_CustomMethod_Return.tasks;

public class FrequencyOfWord {

    public static void main(String[] args) {

        int a=frequencyOfWord("Java java java python java","java");

        System.out.println(a);

    }

    public static int frequencyOfWord(String sentence, String word){

        int count=0;

        for (int i = 0; i < sentence.length()-3; i++) {

            String str=sentence.substring(i,i+4);

            if (str.equalsIgnoreCase(word)){
                count++;
            }

        }

        return count;
    }

}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
    then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */
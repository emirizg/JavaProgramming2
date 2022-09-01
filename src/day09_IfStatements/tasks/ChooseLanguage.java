package day09_IfStatements.tasks;

public class ChooseLanguage {

    public static void main(String[] args) {

        int x=3;

        boolean english= x==1;
        boolean spanish= x==2;
        boolean turkish= x==3;
        boolean russian= x==4;
        boolean french= x==5;

        if (english){
            System.out.println("Hello, thank for your call");
        }else if (spanish){
            System.out.println("Hola, gracias para llamar");
        }else if (turkish){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if (russian){
            System.out.println("Privet, spasibo za vash zvonok");
        }else{
            System.out.println("Merci ,pour votre appel");
        }

    }

}
/*
3. Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5,
Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */

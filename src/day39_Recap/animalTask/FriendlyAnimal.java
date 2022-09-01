package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal {

    public static boolean isWild = false,
            isFriendly = true,
            isPlayable = true;


    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void pet() {
        System.out.println(getName() + " likes being petted");
    }

    public void playing() {
        System.out.println(getName() + " is playing");
    }


}
/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */
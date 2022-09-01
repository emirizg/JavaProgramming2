package day37_Inheritance.day43_Abstraction.animalTask;

public abstract class Animal {

    private String name, breed;
    private int age;
    private char gender;

    public Animal(String name, String breed, int age, char gender) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
/*
Animal Task:
	1. Create a class named Animal:
			Variables:
				name, breed, age, gender

			Add a constructor to set all the fields

			methods:
				eat()
				toString()

	2. Create the following sub classes of Animal and override the eat method:

    abstract Animal

                eat();

            Dog

            Cat

            Tiger

            Eagle

 */
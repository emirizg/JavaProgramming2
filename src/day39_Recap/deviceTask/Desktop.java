package day39_Recap.deviceTask;

public class Desktop extends Computer{


    public Desktop(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void nonPortable(){
        System.out.println(getBrand() + " " + getModel() + " is not portable");
    }

}
/*
5. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				1. Desktop
				2. Laptop
 */
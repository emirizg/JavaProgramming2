package day44_Abstraction.carTask;

public class Audi extends Car implements AutoPark{


    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " : Automatic parking feature enabled : " + AutoPark.hasAutoPark);
    }

    @Override
    public void start() {
        System.out.println("Please push the start button");
    }

    @Override
    public void drive() {
        System.out.println("Nice rides with " + getMake() + " " + getModel());
    }
}
/*
8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

 */
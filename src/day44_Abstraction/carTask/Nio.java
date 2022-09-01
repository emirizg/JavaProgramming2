package day44_Abstraction.carTask;

public class Nio extends Car implements AutoPilot,AutoPark{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Please clap to start");
    }

    @Override
    public void drive() {
        System.out.println("Comfortable driving with " + getMake() + " " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " : Automatic parking is our job : " + AutoPark.hasAutoPark);
    }

    @Override
    public void selfDrive() {
        System.out.println("Are you ready for a fantastic driving experience?" + AutoPilot.hasAutoPilot);
    }
}

package day44_Abstraction.carTask;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Please move your ears to start");
    }

    @Override
    public void drive() {
        System.out.println("Exceptional rides with " + getMake() + " " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " : Automatic parking is a piece of cake for me...\uD83D\uDE98");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " If you want you can sleep...\uD83D\uDE34");
    }

    @Override
    public void fly() {
        System.out.println("Be patient. Take your position and fasten the belts...\uD83D\uDE80");
    }

}
/*
10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces
 */
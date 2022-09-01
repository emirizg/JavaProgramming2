package day44_Abstraction.carTask;

public class Tesla extends Car implements AutoPark,AutoPilot{


    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Please say \"Start\"");
    }

    @Override
    public void drive() {
        System.out.println("Awesome driving with " + getMake() + " " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " : Automatic parking" +"(" +AutoPark.hasAutoPark + ")" + " feature enabled");
    }


    @Override
    public void selfDrive() {
        System.out.println( getMake() + " " + getModel() + "Be cool!!!" + "Auto pilot enabled : " + AutoPilot.hasAutoPilot);
    }
}
/*
9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

 */
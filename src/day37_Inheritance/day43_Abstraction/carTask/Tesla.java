package day37_Inheritance.day43_Abstraction.carTask;

public final class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\"");
    }

}

package day44_Abstraction.deviceTask;

public abstract class Computer extends Device{

    public Computer(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    public void joinMeeting(){
        System.out.println(getBrand() + " " + getModel() + " is joining meeting.");
    }

}
//3. Create a child abstract class of Device named Computer:
//
//					Add any extra methods if needed
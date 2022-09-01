package day44_Abstraction.deviceTask;

public abstract class Phone extends Device {

    public Phone(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    public void call(long phoneNum) {
        System.out.println(getBrand() + " " + getModel() + " is making phoneCall with " + phoneNum);
    }

    public void text(long phoneNum) {
        System.out.println(getBrand() + " " + getModel() + " is texting to " + phoneNum);
    }

}
/*
2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

 */
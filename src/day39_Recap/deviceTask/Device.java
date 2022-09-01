package day39_Recap.deviceTask;

public class Device {

    private String brand, model, color, size;
    private double price;
    public static boolean hasBattery = true,
            hasPowerButton = true;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            System.err.println("Invalid brand");
            System.exit(1);
        }

        if (brand.isEmpty() || brand.isBlank()) {
            System.err.println("Invalid brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("The price can not be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public Device(String brand, String model, String color, String size, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }

    public void turnOn() {
        System.out.println("Turning on " + brand + " " + model);
    }

    public void turnOff() {
        System.out.println("Turning off " + brand + " " + model);
    }


    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
Device Task:
	1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()
 */
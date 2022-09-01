package day44_Abstraction.deviceTask;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private final String size;

    private static boolean hasBattery = true;
    private static boolean hasPowerButton = true;

    public Device(String brand, String model, double price, String color, String size) {
        //brand, model color and size
        if (brand.isEmpty() || brand == null) {
            throw new RuntimeException("Invalid brand: " + brand);
        }
        this.brand = brand;
        if (model.isEmpty() || model.equals(null)) {
            throw new RuntimeException("Invalid brand: " + brand);
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid price: "+price);
        }
        this.price = price;
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

    public static boolean isHasBattery() {
        return hasBattery;
    }

    public static void setHasBattery(boolean hasBattery) {
        Device.hasBattery = hasBattery;
    }

    public static boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public static void setHasPowerButton(boolean hasPowerButton) {
        Device.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price

 */
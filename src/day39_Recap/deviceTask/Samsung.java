package day39_Recap.deviceTask;

public class Samsung extends Phone{
    public Samsung(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void googlePlayStore(String app){
        System.out.println(getBrand() + " "+ getModel() + " is palying "+ app);
    }

}

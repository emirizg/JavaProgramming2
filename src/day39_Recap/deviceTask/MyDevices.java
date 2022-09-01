package day39_Recap.deviceTask;

public class MyDevices {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","12","Blue","6.1",840);
        System.out.println(iphone);
        iphone.faceTime("kkkk@gmail.com");

        Laptop laptop = new Laptop("Apple","MacBook Air","Gray","13.3",1100);
        System.out.println(laptop);
        System.out.println(laptop.getModel());

        

    }

}

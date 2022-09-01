package day37_Inheritance.phoneTask;

public class PhoneShop {


    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12","6.7 inches",1000,"Black");

        Samsung samsung = new Samsung("Galaxy S19","6 inches",900,"White");

        Nokia nokia = new Nokia("Brick","4 inches",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("-----------------------------------");

        iphone.call(911);
        iphone.text(12345678);
        iphone.faceTime(9898714);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("-----------------------------------");

        samsung.call(911);
        samsung.text(123456778);
        samsung.freeze();

        System.out.println("-----------------------------------");

        nokia.call(827482414);
        nokia.text(1728238242);
        nokia.selfDefense();

        System.out.println("-----------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


    }

}

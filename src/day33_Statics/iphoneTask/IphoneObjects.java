package day33_Statics.iphoneTask;

public class IphoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("iPhone 12",940,"Blue","5.6 inches");

        System.out.println(iphone1);

        iphone1.faceTime(123456789);
        iphone1.faceTime("gmail@yahoo.com");
        iphone1.call(123456789);
        iphone1.text(123456789);

    }

}

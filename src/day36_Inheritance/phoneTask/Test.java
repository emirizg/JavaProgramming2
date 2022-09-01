package day36_Inheritance.phoneTask;

public class Test {


    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();
        iphone1.setInfo("Apple","Iphone 12","5.6","Blue",840);

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung","galaxy S19", "6 inches", "White", 900);

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia","Brik", "4 inches", "Pink", 60);

        System.out.println(iphone1);
        System.out.println(samsung);
        System.out.println(nokia);



    }

}

package day44_Abstraction.carTask;

import day38_Inheritance.employeeTask.Test;

public class CarShop {

    public static void main(String[] args) {

        Audi audi = new Audi("Audi","Q7",2019,44_000,"LightBlue");
        audi.autoPark();
        audi.drive();
        audi.start();
        audi.stop();

        System.out.println(audi);

        System.out.println("----------------------------------------------");

        Mercedes mercedes = new Mercedes("Mercedes","GLA",2020,25_000,"Gray");
        mercedes.autoPark();
        mercedes.drive();
        mercedes.start();
        mercedes.stop();
        System.out.println("mercedes.getMake() = " + mercedes.getMake());

        System.out.println(mercedes);

        System.out.println("----------------------------------------------");

        CydeoCar cydeoCar = new CydeoCar("CydeoCar","EU09",2022,90_000,"White");
        cydeoCar.autoPark();
        cydeoCar.drive();
        cydeoCar.fly();
        cydeoCar.start();
        cydeoCar.selfDrive();
        cydeoCar.stop();

        System.out.println(cydeoCar);

        System.out.println("----------------------------------------------");

        Nio nio = new Nio("Nio","kjnk",2021,66_000,"Yellow");
        nio.autoPark();
        nio.drive();
        nio.start();
        nio.stop();

        System.out.println(nio);

        System.out.println("----------------------------------------------");

        Tesla tesla = new Tesla("Tesla","Model3",2018,30_000,"Green");
        tesla.autoPark();
        tesla.drive();
        tesla.selfDrive();
        tesla.start();
        tesla.stop();

        System.out.println(tesla);

    }

}

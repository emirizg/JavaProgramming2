package day38_Inheritance.employeeTask;

public class Test {

    public static void main(String[] args) {

        Tester tester = new Tester("Emir", 20, 'M', 989, 120000, "Apple inc");
        tester.testing();
        tester.work();
        System.out.println(tester);

        ProductOwner productOwner = new ProductOwner("Lucy",34,'F'
                ,12,110000,"Apple Inc",true);
        productOwner.conductMeeting();
        productOwner.work();
        System.out.println(productOwner);

        Driver driver  =new Driver("Ali",47,'M',223,40000,"Lavazza",true);
        driver.work();
        driver.drive();
        System.out.println(driver);

    }

}

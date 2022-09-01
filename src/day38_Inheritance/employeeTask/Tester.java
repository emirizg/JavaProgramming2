package day38_Inheritance.employeeTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, id, "Tester", salary, companyName);
    }

    public void testing(){
        System.out.println(getJobTitle()+" "+getName()+" is testing on "+getCompanyName());
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is working on "+getCompanyName());
    }
}

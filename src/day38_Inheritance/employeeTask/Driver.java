package day38_Inheritance.employeeTask;

public class Driver extends Employee{

    private boolean hasLicence;

    public Driver(String name, int age, char gender, int id, double salary, String companyName, boolean hasLicence) {
        super(name, age, gender, id, "Driver", salary, companyName);
        setHasLicence(hasLicence);
    }

    public boolean isHasLicence() {
        return hasLicence;
    }

    public void setHasLicence(boolean hasLicence) {
        this.hasLicence = hasLicence;
    }

    public void drive(){
        System.out.println(getName()+ " is driving");
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working");
    }

    @Override
    public String toString() {
        return super.toString() + "Driver{" +
                "hasLicence=" + hasLicence +
                '}';
    }
}

package day38_Inheritance.employeeTask;

public class ProductOwner extends Employee{

    private boolean hasExperience;

    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName,boolean hasExperience) {
        super(name, age, gender, id, "PO", salary, companyName);
        setHasExperience(hasExperience);
    }

    public boolean isHasExperience() {
        return hasExperience;
    }

    public void setHasExperience(boolean hasExperience) {
        this.hasExperience = hasExperience;
    }

    public void conductMeeting(){
        System.out.println(getJobTitle()+" "+getName()+" is conducting meeting with his/her employee");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is working on "+getCompanyName());
    }

    @Override
    public String toString() {
        return super.toString()+  "ProductOwner{" +
                "hasExperience=" + hasExperience +
                '}';
    }


}

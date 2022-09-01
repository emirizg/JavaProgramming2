package day32_Constructor;

public class EmployeeObjects {

    /*
    Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call OR contain itself
     */

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");

        Employee employee2 = new Employee("Yuliya",'F');

        Employee employee3 = new Employee("Olga",'F',"SDET");

        Employee employee4 = new Employee("Emir",'M',"SDET",110000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);


    }

}

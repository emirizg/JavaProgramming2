package day33_Statics.personTask;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Emir",20,'M');
        Person person2 = new Person("Max",21,'F');

        System.out.println(person1);
        System.out.println(person2);

        person1.sleep();
        person2.eat("Pizza");

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfHead);




    }

}

import java.util.Arrays;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID=studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }


}

class StudentObject{

    public static void main(String[] args) {

        day33_Statics.Student student1 = new day33_Statics.Student("Ahmet");
        day33_Statics.Student student2 = new day33_Statics.Student("Aygun", 'F');
        day33_Statics.Student student3 = new day33_Statics.Student("Nigara", 11);
        day33_Statics.Student student4 = new day33_Statics.Student("Mert", 12, 'A');
        day33_Statics.Student student5 = new day33_Statics.Student("Cihad", 'M', 28);
        day33_Statics.Student student6 = new day33_Statics.Student("Suhaib", 'M', 27, 15);
        day33_Statics.Student student7= new day33_Statics.Student("Ali",'M',42,30,'A');


        System.out.println(student1 == student2);

        day33_Statics.Student[] students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));



    }

}

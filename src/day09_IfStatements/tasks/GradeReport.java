package day09_IfStatements.tasks;

public class GradeReport {

    public static void main(String[] args) {

        byte score=65;

        if (score >= 90 && score <=100){
            System.out.println("A");
        } else if (score >= 80 && score <= 89 ){
            System.out.println("B");
        } else if (score >= 70 && score <= 79 ){
            System.out.println("C");
        }else if (score >= 60 && score <= 69 ){
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }

}

/*        0 ~ 100

	1. grade report ==> A, B, C, D, F
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
     0 ~ 59 ==> Failed
 */
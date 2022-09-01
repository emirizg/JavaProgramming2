package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int s =135;
        String result=""; // temporary

        if(s >= 0 &&s <= 100){ // if the s is valid
            // 5 possibilities: A,B,C,D,F
            if (s >= 90 ){
                result="Excellent";
            } else if (s >= 80) {
                result="Great";
            }else if (s >= 70 ) {
                result="Good";
            }else if (s >= 60 ) {
                result="Passed";
            }else {
                result="Failed";
            }


        }else { // if the s is NOT valid
            result="Invalid Score";
        }

        System.out.println(result);


        System.out.println("--------------------------------------");
        // solution2: use ternaries only

        int a= 85;
        String result2= (a >= 0 &&a <= 100)?(a >= 90)?"Excellent":(a >= 80)?"Great":(a>=70)?"Good":(a>=60)?"Passed"
                : "Failed" : "Invalid Score";

        System.out.println(result2);

        System.out.println("--------------------------------------");
        //solution3

        String result3="";

        if(s >= 0 &&s <= 100){ // if the s is valid
            // 5 possibilities: A,B,C,D,F
            result3=(a >= 90)?"Excellent":(a >= 80)?"Great":(a>=70)?"Good":(a>=60)?"Passed"
                    : "Failed";


        }else { // if the s is NOT valid
            result3="Invalid Score";
        }

        System.out.println(result3);



    }

}

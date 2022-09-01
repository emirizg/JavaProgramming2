package day20_Arrays.tasks;

public class Classmates {

    public static void main(String[] args) {

        String[] classMates={"Deniz Ates","Elnur Akhundov","Elif Zulal Demir","Egzona Morina"
                ,"Haohuan Shen","Hyoyoung Shen","Ibrahim Yaman","Meleknur Ozgu","Meral Yildiz","Rudi dunga"};

        for (String s : classMates) {
            String initial=s.charAt(0)+"."+s.charAt( s.indexOf(" ")+1 );
            initial=initial.toUpperCase();

            System.out.println(initial);
        }


    }

}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
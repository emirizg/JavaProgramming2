package day20_Arrays.tasks;

public class ClassMates_2 {

    public static void main(String[] args) {

        String[] classMates={"Deniz Ates","Elnur Akhundov","Elif Zulal Demir","Egzona Morina"
                ,"Haohuan Shen","Hyoyoung Shen","Ibrahim Yaman","Meleknur Ozgu","Meral Yildiz","Rudi dunga"};



        for (String s : classMates) {

            String reversed="";

            for (int i = s.length()-1; i >= 0; i--) {

                reversed+=s.charAt(i);

            }

            System.out.println(reversed);
        }

    }

}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
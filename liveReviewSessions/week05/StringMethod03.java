package week05;

public class StringMethod03 {

    public static void main(String[] args) {

        /*
        substring(index,index); --> method ask from me int-indexNumber, return to me : new string in string pool
        replace() method ---> it takes chars(old and new chars) --> returns a new string
                         ---> it also takes Strings (old and new) --> a new string
        When your method is doing more action with other DataTypes : METHOD OVERLOADING

         */

        String message="we still HAVE a long Way to go, So be patient!";
        // make first character uppercase rest is lowercase

        message=message.substring(0,1).toUpperCase() + message.substring(1).toLowerCase();

        System.out.println("message : "+message);

        // how we can do partial uppercase?
        String word="java and java";
        word = word.replace('j','J');
        System.out.println("word : "+word);

        String  browsers="Automation with Chrome Driver";
        // change chorme to firefox
        browsers=browsers.replace("Chrome","Firefox");
        System.out.println(browsers);
    }

}

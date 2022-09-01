package day34_GarbageCollection_AccessModifiers.day42_Exceptions;

class FadyException extends RuntimeException{     // custom unchecked exception

    public FadyException(){
        super("Time for short break");
    }

    public FadyException(String message){
        super(message);
    }

}

class NoBreakException extends Exception{    // custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args)  {

        //throw new FadyException();

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }


}

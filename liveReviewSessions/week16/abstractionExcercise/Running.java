package week16.abstractionExcercise;

public class Running extends Exercise{


    public Running(double weight) {
        super(weight); //call parent abstract class constructor
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int)(minutes*13*(weight/100));
    }

    @Override
    public void  perform(int minutes) {
        System.out.println("Performing running exercise on the Track");
    }

}

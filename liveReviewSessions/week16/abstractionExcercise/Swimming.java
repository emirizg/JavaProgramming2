package week16.abstractionExcercise;

public class Swimming extends Exercise{

    public Swimming(double weight) {
        super(weight);
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int)(minutes*8*(weight/100));
    }

    @Override
    void perform(int minutes) {
        System.out.println("Performing swimming in the pool");
    }
}

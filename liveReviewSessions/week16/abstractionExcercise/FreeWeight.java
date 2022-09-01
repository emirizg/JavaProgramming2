package week16.abstractionExcercise;

public class FreeWeight extends Lifting{


    public FreeWeight(double weight) {
        super(weight);
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int)(minutes*6*(weight/100));
    }

    @Override
    void perform(int minutes) {
        System.out.println("Lifting Free Weight with dumbbells");
    }

    @Override
    void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}

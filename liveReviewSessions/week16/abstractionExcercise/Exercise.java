package week16.abstractionExcercise;

public abstract class Exercise {

    public double weight;

    public Exercise(double weight){
        this.weight=weight;
    }

    public static void giveUpAndEatJunkFood(){
        System.out.println("If you don't feel like use the default static method");
    }

    public abstract int getCaloriesCount(int minutes);
     abstract void perform(int minutes);

    public void start(){
        System.out.println("Warming up and starting the exercise");
    }

}

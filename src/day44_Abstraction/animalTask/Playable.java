package day44_Abstraction.animalTask;

public interface Playable {

    //by default, it is final and static, so you suppose initialize it, the only way assinging it right away
    static boolean isFriendly = true;

    /*
    public static void method1() {
        System.out.println(isFriendly);
    }

     */

    public abstract void play(); //abstract by default & public



}

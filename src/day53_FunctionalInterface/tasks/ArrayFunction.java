package day53_FunctionalInterface.tasks;

@FunctionalInterface
public interface ArrayFunction<T,R> {

    R apply(T[] array);

}

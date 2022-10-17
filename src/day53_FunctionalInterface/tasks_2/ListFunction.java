package day53_FunctionalInterface.tasks_2;

import day34_GarbageCollection_AccessModifiers.T;

import java.util.List;

@FunctionalInterface
public interface ListFunction<T, R> {

    R apply(List<T> list);


}

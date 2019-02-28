package com.Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question5 {

    public static void main(String[] args) {

        Consumer<Integer> consumer = System.out::println;
        consumer.accept(10);

        Supplier<Integer> supplier = () -> 2;
        System.out.println(supplier.get());

        Predicate<Integer> predicate = e -> e % 2 == 0;
        System.out.println(predicate.test(7));

        Function<Integer, Integer> function = e -> e * e;
        System.out.println(function.apply(5));
    }
}

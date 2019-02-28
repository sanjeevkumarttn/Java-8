package com.Java8;

import java.util.Arrays;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 6, 5, 4, 3, 8);
        list.stream()
                .filter(e -> e > 3)
                .filter(e -> e % 2 == 0)
                .findFirst()
                .ifPresent(System.out::println);
    }
}

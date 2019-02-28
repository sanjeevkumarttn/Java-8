package com.Java8;

import java.util.Arrays;
import java.util.List;

public class Question9 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 5, 6, 8, 9, 1, 12);
        list.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);
    }
}

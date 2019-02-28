package com.Java8;

import java.util.Arrays;
import java.util.List;

public class Question11 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 7, 5, 9, 1, 3, 2, 8);
        list.stream()
                .mapToInt(e -> e * 2)
                .average()
                .ifPresent(System.out::println);
    }
}

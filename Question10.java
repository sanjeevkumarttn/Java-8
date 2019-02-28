package com.Java8;

import java.util.Arrays;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 1, 8, 9, 6, 4, 2, 7);
        System.out.println(list.stream()
                .filter(e -> e > 5)
                .mapToInt(e -> e)
                .sum());
    }
}

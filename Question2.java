package com.Java8;

@FunctionalInterface
interface TakeTwoReturnOne {
    int operation(int a, int b);
}

public class Question2 {
    public static void main(String[] args) {
        TakeTwoReturnOne TTRO = (a, b) -> b;
        System.out.println(TTRO.operation(34, 32));
    }
}

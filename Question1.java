package com.Java8;

@FunctionalInterface
interface GreaterValue {
    boolean operation(int a, int b);
}

@FunctionalInterface
interface IncrementVal {
    int operation(int a);
}

@FunctionalInterface
interface ConcatStr {
    String operation(String a, String b);
}

@FunctionalInterface
interface Upper {
    String operation(String a);
}

public class Question1 {

    public static void main(String[] args) {
        GreaterValue g = (a, b) -> a > b;
        System.out.println(g.operation(4, 6));

        IncrementVal inc = (a) -> ++a;
        System.out.println(inc.operation(8));

        ConcatStr cat = (a, b) -> a + b;
        System.out.println(cat.operation("Hello ", "World"));

        Upper u = String::toUpperCase;
        System.out.println(u.operation("Hello World"));
    }
}

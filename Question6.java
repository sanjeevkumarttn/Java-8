package com.Java8;

interface DefaultAndStaticMethodExample {

    static void staticDisplay() {
        System.out.println("This is static method.");
    }

    default void defaultDisplay() {
        System.out.println("This is default method.");
    }
}

public class Question6 implements DefaultAndStaticMethodExample {

    public static void main(String[] args) {

        Question6 defaultMethods = new Question6();
        defaultMethods.defaultDisplay();

        DefaultAndStaticMethodExample.staticDisplay();

    }
}

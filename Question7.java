package com.Java8;

interface DefaultMethod {
    default void display() {
        System.out.println("This is default method of interface");
    }
}

public class Question7 implements DefaultMethod {

    @Override
    public void display() {
        System.out.println("This is overridden default method");
    }

    public static void main(String[] args) {
        Question7 obj = new Question7();
        obj.display();
    }
}

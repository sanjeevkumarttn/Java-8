package com.Java8;


interface Parent {
    default void display() {
        System.out.println("Parent");
    }
}

interface Child1 extends Parent {
    default void display() {
        System.out.println("child1");
    }
}

interface Child2 extends Parent {
    default void display() {
        System.out.println("child2");
    }
}

public class Question8 implements Child1, Child2 {

    public void display() {
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        Question8 obj = new Question8();
        obj.display();
    }
}

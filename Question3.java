package com.Java8;

@FunctionalInterface
interface InterfaceAdd {
    int operation(int a, int b);
}

@FunctionalInterface
interface InterfaceSub {
    int operation(int a, int b);
}

@FunctionalInterface
interface InterfaceMul {
    int operation(int a, int b);
}

class MyMath {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }
}

public class Question3 {
    public static void main(String[] args) {

        InterfaceAdd addObj = new MyMath()::add;
        System.out.println("Add operation using instance method reference: " + addObj.operation(24, 12));

        InterfaceSub subObj = new MyMath()::sub;
        System.out.println("Subtract operation using instance method reference: " + subObj.operation(24, 14));

        InterfaceMul mulObj = MyMath::mul;
        System.out.println("Multiply operation using static method reference: " + mulObj.operation(20, 12));

    }
}

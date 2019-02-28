package com.Java8;

@FunctionalInterface
interface InterfaceEmployee {
    Employee getEmployee(String name, int age, String city);
}

class Employee {
    String name;
    int age;
    String city;

    Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}


public class Question4 {
    public static void main(String[] args) {
        InterfaceEmployee empFactory = Employee::new;
        Employee emp = empFactory.getEmployee("Deepak", 22, "Delhi");
        System.out.println(emp.name + " " + emp.age + " " + emp.city);
    }
}

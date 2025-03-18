package com.leonardof108.inheritancechallenge;

public class Main {
    public static void main(String[] args) {
        Employee marty = new Employee("Marty McFly", "06/12/1968", "06/12/1985");

        System.out.println(marty);
        System.out.println("Marty's age: " + marty.getAge());
        System.out.println("Marty's pay: " + marty.collectPay());
    }
}

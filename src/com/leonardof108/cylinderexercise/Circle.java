package com.leonardof108.cylinderexercise;

public class Circle {
    private double radius;

    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

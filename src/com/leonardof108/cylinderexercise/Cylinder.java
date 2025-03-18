package com.leonardof108.cylinderexercise;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this(0, 0);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

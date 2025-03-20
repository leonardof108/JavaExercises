/*
package com.leonardof108;

public class CarPolymorphism {
    public static void main(String[] args) {
        Car car = new Car("Generic car");
        car.drive();

    }
}

class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void drive() {
        runEngine();
        System.out.println("Driving a " + getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("Engine running");
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

class gasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public gasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}*/

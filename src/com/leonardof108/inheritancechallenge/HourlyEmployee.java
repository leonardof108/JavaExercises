package com.leonardof108.inheritancechallenge;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        hourlyPayRate *= 2;
    }
}

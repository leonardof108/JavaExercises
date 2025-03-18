package com.leonardof108.inheritancechallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public double retire() {
        isRetired = true;
        return annualSalary;
    }
}

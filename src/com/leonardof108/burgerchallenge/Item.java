package com.leonardof108.burgerchallenge;

public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "REGULAR";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if (type.equals("DRINK") || type.equals("SIDE")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> price - 1.0;
            case "LARGE" -> price + 1.0;
            default -> price;
        };
    }

    public Item(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%-20s $%.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }
}
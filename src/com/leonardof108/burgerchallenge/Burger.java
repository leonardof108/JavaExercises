package com.leonardof108.burgerchallenge;

public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getBasePrice() + (extra1 != null ? extra1.getBasePrice() : 0) +
                (extra2 != null ? extra2.getBasePrice() : 0) +
                (extra3 != null ? extra3.getBasePrice() : 0);
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "LETTUCE", "TOMATO", "CARROT" -> 0.5;
            case "CHEESE" -> 1.0;
            case "BACON" -> 1.5;
            default -> 0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("Topping", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("Topping", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("Topping", extra3, getExtraPrice(extra3));
    }

    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrice());
        if (extra1 != null) {
            printItem(extra1.getName(), extra1.getBasePrice());
        }
        if (extra2 != null) {
            printItem(extra2.getName(), extra2.getBasePrice());
        }
        if (extra3 != null) {
            printItem(extra3.getName(), extra3.getBasePrice());
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}

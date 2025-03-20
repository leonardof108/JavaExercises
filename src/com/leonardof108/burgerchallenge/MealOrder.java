package com.leonardof108.burgerchallenge;

public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("Cheeseburger", "Coke", "Fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 5.0);
        this.drink = new Item("Drink", drinkType, 1.0);
        this.side = new Item("Side", sideType, 2.0);
    }

    public double getTotalPrice() {
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL", getTotalPrice());
    }

    public static void main(String[] args) {
        
    }

}

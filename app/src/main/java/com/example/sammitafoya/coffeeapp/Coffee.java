package com.example.sammitafoya.coffeeapp;

public class Coffee {
    public Integer quantity;
    public Boolean hasCream;
    public Boolean hasChoco;

    public final int MAX = 25;
    public final int MIN = 0;

    public Coffee() {
        quantity = 0;
        hasCream = false;
        hasChoco = false;
    }

    public void incrementQuantity() {
        if (quantity < MAX){
            quantity++;
        }
    }

    public void decrementQuantity() {
        if (quantity < MAX){
            quantity--;
        }
    }

    public String getQuanityString() {
        return quantity.toString();
    }

    public void setChoco(boolean isChecked) {
        hasChoco = isChecked;
    }

    public void setCream(boolean isChecked) {
        hasCream = isChecked;
    }

    public String getOrderSummary() {
        Double price = quantity * 3.50;
        if (hasCream) {
            price += quantity * .50;
        }
        if (hasChoco) {
            price += quantity * 1.50;
        }

        String order = "\nORDER SUMMARY\n\n";
        order += "Add Cream? " + (hasCream?"yes":"no") + "\n";
        order += "Add Chocolate? " + (hasChoco?"yes":"no") + "\n";
        order += "Quantity: " + quantity.toString() + "\n\n";
        order += "Price: $" + String.format("%.2f", price) + "\nTHANK YOU!";
        return order;
    }
}

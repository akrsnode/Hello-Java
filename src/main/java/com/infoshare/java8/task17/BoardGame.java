package com.infoshare.java8.task17;

public class BoardGame {

    String name;
    int rating;
    int price;
    int minPlayerAmount;
    int maxPlayerAmount;

    public BoardGame(String name, int rating, int price, int minPlayerAmount, int maxPlayerAmount) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.minPlayerAmount = minPlayerAmount;
        this.maxPlayerAmount = maxPlayerAmount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

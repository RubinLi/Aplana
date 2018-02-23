package com.Ivlev;

public class CandyGroup extends Candy{
    private Candy candy;
    private int amount;

    public CandyGroup(double coast, double weight,
                      int amount, String string) {
        super(coast, weight, string);
        this.candy = candy;
    }

    public int getAmount() {
        return amount;
    }

    public Candy getCandy() {
        return candy;
    }
}

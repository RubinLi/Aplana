package com.Ivlev;

public class Candy {
    private double    coast;
    private double    weight;
    private  String     name;

    public Candy(double coast, double weight, String string) {
        this.coast    = coast;
        this.weight = weight;
        this.name   = string;
        }

    public double getCoast() {
        return coast;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}

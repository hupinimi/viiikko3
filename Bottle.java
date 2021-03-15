package com.example.ht8_2;

import android.view.View;

public class Bottle {

    private String name = "Pepsi Max";
    private String manufacturer = "Pepsi";
    private double total_energy = 0.3;
    private double size = 0.5;
    private double price = 1.80;

    private static Bottle bottle = new Bottle();

    public Bottle(){

    }

    public Bottle(String name, String manufacturer, float total_energy, float size, float price){}

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getEnergy() {
        return total_energy;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}

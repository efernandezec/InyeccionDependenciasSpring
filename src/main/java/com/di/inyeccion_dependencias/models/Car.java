package com.di.inyeccion_dependencias.models;

public class Car {
    
    private String licencePlate;
    private String brand;
    private String color;
    private int doors;


    public Car(String licencePlate, String brand, String color, int doors) {
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.color = color;
        this.doors = doors;
    }

    public Car(){

    }
    
    public String getLicencePlate() {
        return licencePlate;
    }
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car [licencePlate=" + licencePlate + ", brand=" + brand + ", color=" + color + ", doors=" + doors + "]";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}

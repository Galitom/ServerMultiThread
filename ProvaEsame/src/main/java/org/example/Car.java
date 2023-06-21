package org.example;

public class Car {
    private int id;
    private String modello;
    private double price;
    private int kilometri;

    public Car(int id, String modello, double price, int kilometri) {
        this.id = id;
        this.modello = modello;
        this.price = price;
        this.kilometri = kilometri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getKilometri() {
        return kilometri;
    }

    public void setKilometri(int kilometri) {
        this.kilometri = kilometri;
    }
}




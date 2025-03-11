package models;

public abstract class Garment {
    protected String name, size, material, color;
    protected double price;

    public Garment(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

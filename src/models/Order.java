package models;
import java.util.*;

public class Order {
    private List<Garment> garments = new ArrayList<>();
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addGarment(Garment garment) {
        garments.add(garment);
    }

    public List<Garment> getGarments() {
        return garments;
    }

    public Customer getCustomer() {
        return customer;
    }
}


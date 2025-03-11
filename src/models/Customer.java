package models;

public class Customer {
    private String id, name, address, email;

    public Customer(String id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}

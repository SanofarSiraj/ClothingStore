package services;
import models.Order;
import java.util.*;

public class OrderService {
    private static OrderService instance;
    private List<Order> orders = new ArrayList<>();

    private OrderService() {}

    public static OrderService getInstance() {
        if (instance == null) {
            instance = new OrderService();
        }
        return instance;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}

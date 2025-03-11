package tests;

import org.junit.jupiter.api.Test;
import services.OrderService;
import models.Customer;
import models.Order;

import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {
    @Test
    void testSingletonInstance() {
        OrderService instance1 = OrderService.getInstance();
        OrderService instance2 = OrderService.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testAddOrder() {
        OrderService orderService = OrderService.getInstance();
        Customer customer = new Customer("1", "John Doe", "123 Street", "john@example.com");
        Order order = new Order(customer);
        orderService.addOrder(order);
        assertEquals(1, orderService.getOrders().size());
    }
}

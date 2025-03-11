package utils;
import models.Order;
import models.Garment;

public class Receipt {
    public static void print(Order order) {
        System.out.println("\n=== Receipt ===");
        System.out.println("Customer: " + order.getCustomer().getName());
        for (Garment g : order.getGarments()) {
            System.out.println("- " + g.getName() + " ($" + g.getPrice() + ")");
        }
        System.out.println("==================");
    }
}

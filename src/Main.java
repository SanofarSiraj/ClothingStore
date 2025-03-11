import models.*;
import services.OrderService;
import patterns.command.*;
import patterns.observer.*;
import utils.Receipt;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderSystem orderSystem = new OrderSystem();
        CEO ceo = new CEO();
        orderSystem.addObserver(ceo);

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        Customer customer = new Customer(UUID.randomUUID().toString(), name, "123 Street", "email@example.com");
        Order order = new Order(customer);

        boolean addMore = true;
        while (addMore) {
            System.out.println("Choose Garment Type: 1) Pants 2) TShirt 3) Skirt");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                order.addGarment(new Pants.Builder()
                        .size("M").material("Denim").color("Blue").fit("Slim").length("Regular").build());
            } else if (choice == 2) {
                order.addGarment(new TShirt.Builder()
                        .size("L").material("Cotton").color("Black").sleeves("Short").neck("Round").build());
            } else if (choice == 3) {
                order.addGarment(new Skirt.Builder()
                        .size("S").material("Silk").color("Red").waistline("High").pattern("Floral").build());
            }

            System.out.println("Would you like to add another item? (yes/no)");
            String response = scanner.nextLine().toLowerCase();
            addMore = response.equals("yes");
        }


        OrderProcessor processor = new OrderProcessor();
        processor.addCommand(new SewNeckCommand());
        processor.addCommand(new CutSleeveCommand());
        processor.process();

        orderSystem.notifyObservers("Garment is being manufactured.");
        orderSystem.notifyObservers("Garment ready for delivery.");
        Receipt.print(order);
    }
}

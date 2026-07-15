import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(String name, double price, int qty) {
        for (CartItem item : items) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                item.setQuantity(item.getQuantity() + qty);
                return;
            }
        }
        items.add(new CartItem(name, price, qty));
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getItemName().equalsIgnoreCase(name));
    }

    public double calculateTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public void displayCart() {
        for (CartItem item : items) {
            System.out.println(item.getItemName() + " - Qty: " + item.getQuantity() + " - Price: " + item.getPrice());
        }
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class simulateShoppingCart {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ShoppingCart cart = new ShoppingCart();
            while (true) {
                System.out.println("\n1. Add Item\n2. Remove Item\n3. View Cart\n4. Exit");
                System.out.print("Choose option: ");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 4) break;

                switch (choice) {
                    case 1:
                        System.out.print("Enter item name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();
                        System.out.print("Enter quantity: ");
                        int qty = sc.nextInt();
                        cart.addItem(name, price, qty);
                        break;
                    case 2:
                        System.out.print("Enter item name to remove: ");
                        String remName = sc.nextLine();
                        cart.removeItem(remName);
                        break;
                    case 3:
                        cart.displayCart();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}

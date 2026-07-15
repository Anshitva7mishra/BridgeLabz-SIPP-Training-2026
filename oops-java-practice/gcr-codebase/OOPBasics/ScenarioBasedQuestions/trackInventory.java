import java.util.Scanner;

class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
}

public class trackInventory {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Item Code: ");
            String itemCode = sc.nextLine();
            System.out.print("Enter Item Name: ");
            String itemName = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            Item item = new Item(itemCode, itemName, price);
            System.out.println("\nItem Details:");
            item.displayDetails();
            System.out.println("Total Cost for " + quantity + " items: " + item.calculateTotalCost(quantity));
        }
    }
}

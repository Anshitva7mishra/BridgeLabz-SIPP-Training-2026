interface FoodDelivery {
    default void trackOrder() {
        System.out.println("Food Delivery Status: Dispatched from restaurant.");
    }
    static String generateDeliveryCode() {
        return "FOOD-DEL";
    }
}

interface GroceryDelivery {
    default void trackOrder() {
        System.out.println("Grocery Delivery Status: Order packed and dispatched.");
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {
    private String name;

    public DeliveryExecutive(String name) {
        this.name = name;
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking orders for executive: " + name);
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }

    public void processDeliveries(String[] customers) {
        System.out.println("\nProcessing Deliveries:");
        for (String c : customers) {
            String code = FoodDelivery.generateDeliveryCode();
            System.out.println("Executive " + name + " delivering to " + c + " | Code: " + code);
        }
    }
}

public class foodDeliveryPartner {
    public static void main(String[] args) {
        String[] customers = {"Alice", "Bob", "Charlie"};
        DeliveryExecutive exec = new DeliveryExecutive("John");
        exec.trackOrder();
        exec.processDeliveries(customers);
    }
}

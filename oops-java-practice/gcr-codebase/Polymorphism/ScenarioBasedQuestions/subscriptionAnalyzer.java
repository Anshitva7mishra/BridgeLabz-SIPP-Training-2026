class Subscription {
    private String subscriberName;
    private String subscriptionId;

    public Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public double calculateMonthlyCharge() {
        return 0.0;
    }
}

class BasicPlan extends Subscription {
    public BasicPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    public double calculateMonthlyCharge() {
        return 9.99;
    }
}

class PremiumPlan extends Subscription {
    public PremiumPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    public double calculateMonthlyCharge() {
        return 14.99;
    }
}

class FamilyPlan extends Subscription {
    public FamilyPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    public double calculateMonthlyCharge() {
        return 19.99;
    }
}

public class subscriptionAnalyzer {
    public static void searchById(Subscription[] list, String id) {
        for (Subscription s : list) {
            if (s.getSubscriptionId().equalsIgnoreCase(id)) {
                System.out.println("Found Subscription: " + s.getSubscriberName() + " | Plan: " + s.getClass().getSimpleName() + " | Charge: $" + s.calculateMonthlyCharge());
                return;
            }
        }
        System.out.println("Subscription ID " + id + " not found.");
    }

    public static void displayByStartingLetter(Subscription[] list, char letter) {
        char upperLetter = Character.toUpperCase(letter);
        System.out.println("Subscribers starting with '" + upperLetter + "':");
        for (Subscription s : list) {
            if (s.getSubscriberName().toUpperCase().startsWith(String.valueOf(upperLetter))) {
                System.out.println("- " + s.getSubscriberName() + " (" + s.getSubscriptionId() + ")");
            }
        }
    }

    public static double calculateTotalMonthlyRevenue(Subscription[] list) {
        double total = 0;
        for (Subscription s : list) {
            total += s.calculateMonthlyCharge();
        }
        return total;
    }

    public static void displayMostExpensive(Subscription[] list) {
        Subscription expensive = null;
        for (Subscription s : list) {
            if (expensive == null || s.calculateMonthlyCharge() > expensive.calculateMonthlyCharge()) {
                expensive = s;
            }
        }
        if (expensive != null) {
            System.out.println("Most Expensive Subscription: " + expensive.getSubscriberName() + " | Plan: " + expensive.getClass().getSimpleName() + " | Charge: $" + expensive.calculateMonthlyCharge());
        }
    }

    public static void main(String[] args) {
        Subscription[] list = new Subscription[4];
        list[0] = new BasicPlan("Alice", "SUB001");
        list[1] = new PremiumPlan("Bob", "SUB002");
        list[2] = new FamilyPlan("Charlie", "SUB003");
        list[3] = new BasicPlan("Arthur", "SUB004");

        System.out.println("Total Monthly Revenue: $" + calculateTotalMonthlyRevenue(list));
        displayMostExpensive(list);
        System.out.println();

        displayByStartingLetter(list, 'A');
        System.out.println();

        System.out.println("Searching for SUB002:");
        searchById(list, "SUB002");
    }
}

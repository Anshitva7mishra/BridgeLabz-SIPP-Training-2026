class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Ordered";
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    protected String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }
}

public class retailOrderManagement {
    public static void main(String[] args) {
        Order o = new Order("ORD001", "2026-06-25");
        ShippedOrder s = new ShippedOrder("ORD002", "2026-06-26", "TRK98765");
        DeliveredOrder d = new DeliveredOrder("ORD003", "2026-06-27", "TRK12345", "2026-06-28");

        System.out.println("Order 1 status: " + o.getOrderStatus());
        System.out.println("Order 2 status: " + s.getOrderStatus());
        System.out.println("Order 3 status: " + d.getOrderStatus());
    }
}

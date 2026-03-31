package oops_practice.scanrio_based.E_CommerceOrderManagementSystem;

public class Order {
    private Product product;
    private int orderId;
    private int quantity;
    private String status;

    Order(int orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.status = "CREATED";
    }

    public void placeOrder(Payment payment) {
        double totalAmount = product.getproductPrice() * quantity;
        payment.pay(totalAmount);
        status = "PLACED";
    }

    public void cancelOrder() {
        if (status.equals("DELIVERED")) {
            System.out.println("Order cannot be cancelled after delivery");
        } else {
            status = "CANCELLED";
            System.out.println("Order cancelled successfully");
        }
    }

    public void trackOrder() {
        System.out.println("Current Order Status: " + status);
    }
}

package oops_practice.scanrio_based.E_CommerceOrderManagementSystem;

public class Customer {
    private int customerId;
    private String customerName;

    Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Order placeOrder(int orderId, Product product, int quantity, Payment payment) {
        Order order = new Order(orderId, product, quantity);
        order.placeOrder(payment);
        return order;
    }

    public void cancelOrder(Order order) {
        order.cancelOrder();
    }
}

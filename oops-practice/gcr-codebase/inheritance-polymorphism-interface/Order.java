package oops_practice.inheritance;

public class Order {
	int orderId ;
	String orderDate;
	Order (int orderId,String orderDate){
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	String getOrderStatus() {
		return "Order palced";
	}
	
	public static void main(String[] args) {
		DeliveredOrder deliveredOrder = new DeliveredOrder(101,"1st janaury 2025",1010101,
				"3st janaury 2025");
		System.out.println("Status of order : "+deliveredOrder.getOrderStatus());
	}
}
class ShippedOrder extends Order{
	int trackingNumber;
	ShippedOrder(int orderId,String orderDate,int trackingNumber){
		super(orderId,orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	String getOrderStatus() {
		return "Order shipped";
	}
	
}
class DeliveredOrder extends ShippedOrder{
	String deliveryDate ;
	DeliveredOrder(int orderId, String orderDate, int trackingNumber,String deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	String getOrderStatus() {
		return "Order delevired";
	}
}
package java_8_features.functionalInterface.defaultMethodsinInterfaces;

interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Default Refund Processed: " + amount);
    }
}

class UPIPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("UPI Payment Done: " + amount);
    }
}

class CreditCardPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Credit Card Payment Done: " + amount);
    }
}

public class PaymentGateway {
	public static void main(String[] args) {
        PaymentProcessor upi = new UPIPayment();
        upi.pay(1000);
        upi.refund(200);  
        System.out.println();
        PaymentProcessor card = new CreditCardPayment();
        card.pay(2000);
        card.refund(500);  
    }
}

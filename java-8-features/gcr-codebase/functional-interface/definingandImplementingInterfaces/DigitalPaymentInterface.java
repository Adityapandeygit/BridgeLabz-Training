package java_8_features.functionalInterface.definingandImplementingInterfaces;

interface DigitalPayment {
    void pay(double amount);
}

class UPI implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done using UPI.");
    }
}

class CreditCard implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Credit Card.");
    }
}

class Wallet implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Wallet.");
    }
}
public class DigitalPaymentInterface {
	public static void main(String[] args) {
        DigitalPayment upi = new UPI();
        DigitalPayment creditCard = new CreditCard();
        DigitalPayment wallet = new Wallet();
        upi.pay(1500);
        creditCard.pay(3200);
        wallet.pay(500);
    }
}

package oops_practice.scanrio_based.vehicleRentalApplication;

public class Customer{
	private int customerId;
    private String name;
    private Vehicle customer1;
    private int days;
    private double bill;
    Customer(int customerId, String name, Vehicle customer1,int days) {
        this.customerId = customerId;
        this.name = name;
        this.days = days;
        this.customer1 = customer1;
        this.bill = customer1.calculateRent(days);
    }
    
    
  public void displayCustomer() {
      System.out.println("Customer ID: " + customerId);
      System.out.println("Name: " + name);
      System.out.println("Vehicle: " + customer1.getVehicleNo());
      System.out.println("Days: " + days);
      System.out.println("Total Bill: " + bill);
  }



	
}

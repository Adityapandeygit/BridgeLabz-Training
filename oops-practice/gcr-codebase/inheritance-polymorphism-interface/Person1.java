package oops_practice.inheritance;

public class Person1 {
	String name;
    int id;
    Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
    
    public static void main(String[] args) {
    	Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Amit", 201);
        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
	}
}
interface Worker {
    void performDuties();
}

class Chef extends Person1 implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
	public void performDuties() {
        System.out.println("Chef is preparing delicious meals");
    }
}

class Waiter extends Person1 implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Waiter is serving food to customers");
    }
}

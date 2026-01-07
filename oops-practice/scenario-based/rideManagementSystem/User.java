package oops_practice.scanrio_based.rideManagementSystem;

public class User {
	private int id;
    private String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }
}

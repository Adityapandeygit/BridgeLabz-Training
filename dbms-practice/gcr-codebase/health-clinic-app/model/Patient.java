package jdbc_dbms.healthclinic.model;

public class Patient {
	private int id;
    private String name;
    private String dob;
    private String phone;
    private String address;
    private String bloodGroup;

    public Patient(String name, String dob, String phone, String address, String bloodGroup) {
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }

    public String getName() { return name; }
    public String getDob() { return dob; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getBloodGroup() { return bloodGroup; }
}

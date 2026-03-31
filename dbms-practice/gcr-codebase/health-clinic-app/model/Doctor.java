package jdbc_dbms.healthclinic.model;

public class Doctor {
	private String name;
    private String phone;
    private double fee;
    private int specialtyId;

    public Doctor(String name, String phone, double fee, int specialtyId) {
        this.name = name;
        this.phone = phone;
        this.fee = fee;
        this.specialtyId = specialtyId;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public double getFee() { return fee; }
    public int getSpecialtyId() { return specialtyId; }
}

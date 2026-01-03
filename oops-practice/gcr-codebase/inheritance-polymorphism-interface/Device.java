package oops_practice.inheritance;

public class Device {
	int deviceId ;
	String status;
	Device(int deviceId,String status){
		this.deviceId = deviceId;
		this.status = status;
	}
	
	public static void main(String[] args) {
		Thermostat thermostat = new Thermostat(10101,"Working","Default");
		thermostat.displayStatus();
	}
}
class Thermostat extends Device{
	String temperatureSetting;
	Thermostat(int deviceId, String status,String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	void displayStatus() {
		System.out.println("Device Id : "+deviceId);
		System.out.println("Device status : "+status);
		System.out.println("Device Temperature Setting : "+temperatureSetting);
	}
	
}

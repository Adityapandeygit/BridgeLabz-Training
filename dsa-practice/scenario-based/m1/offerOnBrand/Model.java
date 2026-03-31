package m1.offerOnBrand;

public class Model {
	private String modelName;
	private int carSpeed;
	public Model(String modelName,int carSpeed){
		this.modelName = modelName;
		this.carSpeed = carSpeed;
	}
	public String getModel() {
		return this.modelName;
	}
	public int getcarSpeed() {
		return this.carSpeed;
	}
	public void setModel(String model) {
		this.modelName = model;
	}
	public void setcarSpeed(int carSpeed) {
		this.carSpeed = carSpeed;
	}
	
	public String toString() {
		return "Carmodel : " + modelName + "CarSpeed : " + carSpeed;
	}
}

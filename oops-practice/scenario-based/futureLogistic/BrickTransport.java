package oops_practice.scanrio_based.futureLogistic;

public class BrickTransport extends GoodsTransport{
	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	public BrickTransport(String transportId ,String transportDate,int transportRating, float brickSize,int brickQuantity,float brickPrice) {
		super(transportId,transportDate,transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}
	public float getbrickSize() {
		return brickSize;
	}
	public int getbrickQuantity() {
		return brickQuantity;
	}
	public float getbrickPrice() {
		return brickPrice;
	}
	public void setbrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
	public void setbrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	public void setbrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	
	public String vehicleSelection() {
		if(brickQuantity<300) {
			return "Truck";
		}
		else if(brickQuantity>300 && brickQuantity<=500) {
			return "Lorry";
		}
		else {
			return "MonsterLorry";
		}
	}
	public float calculateTotalCharge() {
		float totalBrickCost = brickQuantity*brickPrice;
		String  vehicleType = vehicleSelection(	);
		float vehiclePrice = 0;
		if(vehicleType.equals("Truck")) {
			vehiclePrice=1000;
		}
		else if(vehicleType.equals("Lorry")) {
			vehiclePrice=1700;
		}
		else {
			vehiclePrice=3000;
		}
		float tax = (float) (totalBrickCost*0.3);
		
		float discount = 0;
		if(transportRating==5) {
			discount = (float) (0.20 * totalBrickCost);
		}
		else if(transportRating==3 || transportRating==4) {
			discount = (float) (0.10 * totalBrickCost);
		}
		else {
		}
		
		float totalCharges = (totalBrickCost + vehiclePrice + tax)-discount;
		return totalCharges;
	}
	
	
	
}

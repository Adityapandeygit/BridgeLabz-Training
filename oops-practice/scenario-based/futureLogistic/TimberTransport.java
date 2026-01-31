package oops_practice.scanrio_based.futureLogistic;

public class TimberTransport extends GoodsTransport{
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	
	public  TimberTransport(String transportId ,String transportDate,int transportRating, float timberLength,float timberRadius,String timberType,float timberPrice) {
		super(transportId,transportDate,transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}
	public float gettimberLength() {
		return timberLength;
	}
	public float gettimberRadius() {
		return timberRadius;
	}
	public String gettimberType() {
		return timberType;
	}
	public float gettimberPrice() {
		return timberPrice;
	}
	
	public void settimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	public void settimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}
	public void setbrickPrice(String timberType) {
		this.timberType = timberType;
	}
	public void settimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	
	
	public String vehicleSelection() {
		float area = (float) (2 * 3.147 * timberRadius*timberLength);
		if(area<250) {
			return "Truck";
		}
		else if(area>300 && area<=400) {
			return "Lorry";
		}
		else {
			return "MonsterLorry";
		}
	}
	
	public float calculateTotalCharge() {
		float Volume = (float) (3.147 * timberRadius * timberRadius * timberLength);
		
		
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
		
		float price = 0;
		if(timberType.equals("Premium")) {
			price = (float) (Volume * timberPrice * 0.25);
		}
		if(timberType.equals("NonPremium")) {
			price = (float) (Volume * timberPrice * 0.15);
		}
				
		float tax = (float) (price*0.3);
		
		float discountPercentage =0;
		if(transportRating==5) {
			discountPercentage = 20;
		}
		else if(transportRating==3 || transportRating==4) {
			discountPercentage = 10;
		}
		else {
			
		}
		float discount = price*discountPercentage/100;
		
		float totalcharge = ((price) + vehiclePrice + tax) - discount;
		
		return totalcharge;
	}
	

}

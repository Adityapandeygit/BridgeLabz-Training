package oops_practice.scanrio_based.futureLogistic;

public abstract class GoodsTransport {
	protected String transportId;
	protected String transportDate;
	protected int transportRating;
	
	public GoodsTransport(String transportId,String transportDate,int transportRating) {
		this.transportId = transportId;
		this.transportDate = transportDate;
		this.transportRating = transportRating;
	}
	public String gettransportId() {
		return transportId;
	}
	public String gettransportDate() {
		return transportDate;
	}
	public int gettransportRating() {
		return transportRating;
	}
	public void settransportId(String transportId) {
		this.transportId = transportId;
	}
	public void settransportDate(String transportDate) {
		this.transportDate = transportDate;
	}
	public void settransportRating(int transportRating) {
		this.transportRating =  transportRating;
	}

	
	public abstract String vehicleSelection();
	
	public abstract float calculateTotalCharge();
			
}

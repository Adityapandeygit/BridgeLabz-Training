package oops_practice.scanrio_based.futureLogistic;

public class Utility {
	public boolean validatetransportId(String transportId) {
		String regex = "^[A-Z]{3}[0-9]{3}[A-Z]$";
		return transportId.matches(regex);
	}
	
	
	public GoodsTransport parseDetails(String input) {
		
		String[] data = input.split(":");
		String transportId = data[0];
		if (validatetransportId(transportId)) {
		    System.out.println("Transport id " + transportId + " is valid");
		} else {
		    System.out.println("Transport id " + transportId + " is invalid" + "Please provide a valid record");
		}
		
		String transportType = data[3];
        
        if (transportType.equalsIgnoreCase("BrickTransport")) {
        	
        	String date = data[1];
        	int rating = Integer.parseInt(data[2]);
        	float brickSize = Float.parseFloat(data[4]);
        	int quantity = Integer.parseInt(data[5]);
        	float price = Float.parseFloat(data[6]);
        	
        	return new BrickTransport(transportId,date,rating,brickSize,quantity,price);
        }
        
        if (transportType.equalsIgnoreCase("TimberTransport")) {
        	
        	String date = data[1];
        	int rating = Integer.parseInt(data[2]);
        	String type = data[6];
        	float timberLength = Float.parseFloat(data[4]);
        	float radius = Float.parseFloat(data[5]);
        	float price = Float.parseFloat(data[7]);
            return new TimberTransport(transportId, date, rating, timberLength,radius,type,price);
        }
        return null;
	}
	
	public String findObjectType(GoodsTransport goodsTransport) {
		if(goodsTransport instanceof TimberTransport) {
			return "TimberTransport";
		}
		return "BrickTransport";
	}
	
	
}

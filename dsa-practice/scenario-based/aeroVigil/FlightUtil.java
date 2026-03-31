package dsa_practice.scenario_based.aeroVigil;
class InvalidFlightException extends Exception{
	public InvalidFlightException(String msg) {
		super(msg);
	}
}
public class FlightUtil {
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{
		String regex = "[A-Z]d{2}d{4}";
		if(regex.matches(flightNumber)) {
			throw new InvalidFlightException("The flight number" + flightNumber + "isinvalid .");
		}
		else {
			return true;
		}
	}
	public boolean validateFlightName(String flightName) throws InvalidFlightException{
		if (flightName.equalsIgnoreCase("SpiceJet") ||
	            flightName.equalsIgnoreCase("Vistara") ||
	            flightName.equalsIgnoreCase("IndiGo") ||
	            flightName.equalsIgnoreCase("Air Arabia")) {
	            return true;
	    }
		else {
			throw new InvalidFlightException("The flight name "+flightName+" invalid  ");
		}
	}
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException{
		if(flightName.equalsIgnoreCase("SpiceJet") && (passengerCount<=0 || passengerCount>396)) {
			throw new InvalidFlightException("Invalid feul name" + flightName);
		}
		if(flightName.equalsIgnoreCase("Vistara") && (passengerCount<=0 || passengerCount>615)) {
			throw new InvalidFlightException("Invalid feul name "+ flightName);
		}
		if(flightName.equalsIgnoreCase("IndiGo") && (passengerCount<=0 || passengerCount>230)) {
			throw new InvalidFlightException("Invalid feul name " + flightName);
		}
		if(flightName.equalsIgnoreCase("Air Arabia") && (passengerCount<=0 || passengerCount>130)) {
			throw new InvalidFlightException("Invalid feul name"  + flightName);
		}
		return true;
	}
	
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException{
		double maxCapacity =0;
		if(flightName.equalsIgnoreCase("SpiceJet") && (currentFuelLevel==0 || currentFuelLevel>200000)) {
			throw new InvalidFlightException("The passenger count " + currentFuelLevel +" is invalid for " + flightName);
		}
		else {
			maxCapacity = 200000;
		}
		
		if(flightName.equalsIgnoreCase("Vistara") && (currentFuelLevel<=0 || currentFuelLevel>300000)) {
			throw new InvalidFlightException("The passenger count " + currentFuelLevel +" is invalid for " + flightName);
		}
		else {
			maxCapacity = 300000;
		}
		
		if(flightName.equalsIgnoreCase("IndiGo") && (currentFuelLevel<=0 || currentFuelLevel>250000)) {
			throw new InvalidFlightException("The passenger count " + currentFuelLevel +" is invalid for " + flightName);
		}
		else {
			maxCapacity = 250000;
		}
		
		if(flightName.equalsIgnoreCase("Air Arabia") &&( currentFuelLevel<=0 || currentFuelLevel>150000)) {
			throw new InvalidFlightException("The passenger count " + currentFuelLevel +" is invalid for " + flightName);
		}
		else {
			maxCapacity = 150000;
		}
		return maxCapacity-currentFuelLevel;
	}
}

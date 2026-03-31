package m1.TechStore;
class InvalidGadgetException extends Exception {
	public InvalidGadgetException(String msg) {
		super(msg);
	}
}
public class GadgetValidatorUtil {
	public boolean validateGadgetID(String gadgetID)throws InvalidGadgetException {
		String r = "^[A-Z][0-9]{3}$";
		if(!r.matches(gadgetID)) {
			throw new InvalidGadgetException("Invalid gadget ID");
		}
		return true;
	}
	
	
	public boolean validateWarrantyPeriod(int period) throws InvalidGadgetException{
		if(period<6&&period>36) {
			throw new InvalidGadgetException("Invalid warranty period");
		}
		return true;
	}


}




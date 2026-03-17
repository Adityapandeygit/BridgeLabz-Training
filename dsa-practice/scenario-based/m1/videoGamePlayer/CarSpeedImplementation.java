package m1.videoGamePlayer;

public class CarSpeedImplementation extends CarSpeed{

	public String setCarSpeed(CarSpeed sp , int spd)  {
		try {
			if(spd<30 || spd>90) {
				throw new SpeedInvalidException("Exception in Speed Validation");
			}
			else {
				sp.speed = "Valid";
			}
		}
		catch(SpeedInvalidException e) {
			sp.speed = e.getMessage();	
		}
		return sp.speed;
		
	}
}

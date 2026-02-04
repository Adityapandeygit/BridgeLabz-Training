package java_8_features.lambdaExpression;

import java.util.function.Consumer;

class SmartLight {
    String location;
    public SmartLight(String location) {
        this.location = location;
    }
    public void activate(Consumer<SmartLight> behavior) {
        behavior.accept(this);
    }

    public String getLocation() {
        return location;
    }
}
	public class SmartHome {
	    public static void main(String[] args) {
	        SmartLight livingRoomLight = new SmartLight("Living Room");
	        SmartLight kitchenLight = new SmartLight("Kitchen");

	        Consumer<SmartLight> motionTrigger = light ->
	                System.out.println("Motion detected! Turning on " + light.getLocation() + " light.");

	        Consumer<SmartLight> nightTimeTrigger = light ->
	                System.out.println("It's night time! Dimming " + light.getLocation() + " light.");

	        Consumer<SmartLight> voiceCommandTrigger = light ->
	                System.out.println("Voice command received! Activating " + light.getLocation() + " light pattern.");

	        livingRoomLight.activate(motionTrigger);
	        kitchenLight.activate(nightTimeTrigger);
	        livingRoomLight.activate(voiceCommandTrigger);
	    }
	}


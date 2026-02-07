package collections_practice.scenario_based.oceanFleet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VesselUtil {
	private List<Vessel> vesselList = new ArrayList<>();
	
	// Getter and Setter 
	public List<Vessel> getVesselList(){
		return vesselList;
	}
	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	public Vessel getVesselById(String vesselId) {
		for(Vessel v : vesselList) {
			if(v.getVesselId().equalsIgnoreCase(vesselId)) {
				return new Vessel(v.getVesselId(),v.getVesselName(),v.getAverageSpeed(),v.getVesselType());
			}
		}
		return null;
	}
	public List<Vessel> getHighPerformanceVessel(){
		List<Vessel> v1 = new ArrayList<>();
		double max =0;
		for(Vessel v : vesselList) {
			if(v.getAverageSpeed()>max) {
				max = v.getAverageSpeed();
			}
		}
		for(Vessel v : vesselList) {
			if(v.getAverageSpeed()==max) {
				v1.add(v);
			}
		}
		return v1;
		
	}
	
}

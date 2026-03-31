package m1.oceanFleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
	private List<Vessel> vesselList = new ArrayList<>();

	public List<Vessel> getVesselList() {
		return vesselList;
	}

	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		for(Vessel ves : vesselList){
			if(ves.getVesselId()
					.equals(vesselId)) {
				return ves;
			}
		}
		return null;
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> l = new ArrayList<>();
		double max = Double.MIN_VALUE;
		for(Vessel ves : vesselList) {
			if(ves.getAverageSpeed()>max) {
				max = ves.getAverageSpeed();
			}
		}
		for(Vessel ves : vesselList) {
			if(ves.getAverageSpeed()==max) {
				l.add(ves);
			}
		}
		return l;
	}
}

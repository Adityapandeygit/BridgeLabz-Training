package dsa_practice.scenario_based.factoryRobotHazardAnalyzer;

import java.util.Scanner;

class RobotSafetyException extends Exception{
	public RobotSafetyException(String msg) {
		super(msg);
	}
}
public  class RobotHazardAuditor {
	public static double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException {
		double HazardRisk =0;
		if(armPrecision<0.0 || armPrecision>1.0) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}
		else if(workerDensity<1 || workerDensity>20) {
			throw new RobotSafetyException("Error: Worker density must be 1-20");
		}
		else if(!machineryState.equals("Wom") && !machineryState.equals("Faulty") && !machineryState.equals("Critical")) {
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}
		else {
			if(machineryState.equals("Wom")) {
				 HazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * 1.3);
			}
			if(machineryState.equals("Faulty")) {
				 HazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * 2.0);
			}
			if(machineryState.equals("Critical")) {
				 HazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * 3.0);
			}
		}
		return HazardRisk;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Arm Precision (0.0 - 1.0):");
			double armPrecision = sc.nextDouble();
			System.out.println("Enter Worker Density (1 - 20):");
			int workerDensity = sc.nextInt();
			System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
			String machineryState = sc.next();
			double risk = CalculateHazardRisk(armPrecision,workerDensity,machineryState);
			System.out.println("Robot Hazard Risk Score: " + risk);
			
		}
		catch(RobotSafetyException e) {
			System.out.println(e.getMessage());
		}
	}
}

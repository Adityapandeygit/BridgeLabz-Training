package oops_practice.scanrio_based.rideManagementSystem;


public interface FareCalculator {
    double calculate(double distance);
}
class NormalFare implements FareCalculator {
    public double calculate(double distance) {
        return distance * 20;
    }
}

class PeakFare implements FareCalculator {
    public double calculate(double distance) {
        return distance * 30;
    }
}
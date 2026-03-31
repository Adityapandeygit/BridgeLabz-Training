package review.SmartEnergyConsuptionMonitor;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartEnergyMonitor {
     Map<String, List<Double>> usage = new HashMap<>();

    public void addReading(String date, double reading) throws InvalidEnergyReadingException {
        if (reading < 0) {
            throw new InvalidEnergyReadingException("Invalid energy .");
        }

        usage.put(date, new ArrayList<>());
        usage.get(date).add(reading);
    }

    public double getDailyAverage(String date) {
        List<Double> readings = usage.get(date);

        if (readings == null || readings.isEmpty()) {
            return 0;   
        }

        double sum = 0;
        for (double r : readings) {
            sum += r;
        }
        return sum / readings.size();
    }


    public double getMonthlyAverage() {
        double sum = 0;
        int count = 0;
        for (List<Double> readings : usage.values()) {
            for (double r : readings) {
                sum += r;
                count++;
            }
        }
        return sum/count;
    }

}

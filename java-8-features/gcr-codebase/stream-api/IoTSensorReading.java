package java_8_features.stream_Api;

import java.util.Arrays;
import java.util.List;

public class IoTSensorReading {
	public static void main(String[] args) {
		List<Double> readings = Arrays.asList(
		        25.5, 30.2, 18.6, 40.1, 35.0, 22.4
		);
		double threshold = 30.0;
		readings.stream().filter((r) -> r>threshold).forEach(r -> System.out.println(r));
	}
}

package dsa_practice.stack_queue_hashmap_hashfunction;

public class CircularTour {
	public static int findStartingPoint(int[] petrol, int[] distance) {
        int start = 0;
        int balance = 0;
        int deficit = 0;
        for (int i = 0; i < petrol.length; i++) {
            balance += petrol[i] - distance[i];	
            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }
        return (balance + deficit >= 0) ? start : -1;
	}
	public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int start = findStartingPoint(petrol, distance);
        System.out.println("Starting Petrol Pump Index: " + start);
    }
}

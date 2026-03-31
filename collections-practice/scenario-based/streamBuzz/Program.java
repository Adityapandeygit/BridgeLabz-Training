package collections_practice.scenario_based.streamBuzz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program {
	
	public void RegisterCreator(CreatorStats record) {
		CreatorStats.EngagementBoard.add(record);
	}
	
	public Map<String,Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold){
		Map<String , Integer> map = new HashMap<>();
		
		for(CreatorStats r :records) {
			int numberOfWeek = 0;
			double[] temp = r.WeeklyLikes;
			for(double d :temp) {
				if(d>=likeThreshold) {
					numberOfWeek++;
				}
			}
			if(numberOfWeek>0) {
				map.put(r.CreatorName, numberOfWeek);
			}
		}
		
		return map;
	}
	
	public double CalculateAverageLikes() {
		double avg = 0;
		int size=0;
		for(CreatorStats cs : CreatorStats.EngagementBoard) {
			double[] weeklyLikes = cs.WeeklyLikes;
			for(double d :weeklyLikes) {
				avg+=d;
				size++;
			}
		}
		if (size == 0) return 0;
		return avg/size;
	}
	
	
	public static void main(String[] args) {
		Program p = new Program();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1. Register Creator");
			System.out.println("2. Show Top Posts");
			System.out.println("3. Calculate Average Likes");
			System.out.println("4. Exit");
			System.out.println();
			
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			
		switch(choice) {
		case 1: 
			System.out.println("Enter Creater Name : ");
			String name  = sc.next();
			System.out.println("Enter weekly likes (Week 1 to 4):");
			double[] weeklyLikes = new double[4];
			for (int i = 0; i < 4; i++) {
	            weeklyLikes[i] = sc.nextDouble();
	        }
			p.RegisterCreator(new CreatorStats(name,weeklyLikes));
			System.out.println("Creator registered successfully");
			break;
		case 2:
			System.out.println("Input the likeThreshold");
			double likeThreshold = sc.nextDouble();
			Map<String, Integer> result = p.GetTopPostCounts(CreatorStats.EngagementBoard, likeThreshold);
			if (result.isEmpty()) {
                System.out.println("No top-performing posts this week");
            }
			else {
				for (String s : result.keySet()) {
                    System.out.println(s + " - " + result.get(s));
                }
			}
		case 3:
            double avg = p.CalculateAverageLikes();
            System.out.println("Overall average weekly likes: " + (int)avg);
            break;
		case 4:
            System.out.println("Logging off - Keep Creating with StreamBuzz!");
            return;
		default:
            System.out.println("Invalid choice");
		}
		
		}
	}
}

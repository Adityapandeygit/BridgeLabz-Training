package collections_practice.scenario_based.streamBuzz;

import java.util.ArrayList;
import java.util.List;

public class CreatorStats {
	String CreatorName;
	double[] WeeklyLikes;
	public static List<CreatorStats> EngagementBoard = new ArrayList<>();
	public CreatorStats(String creatorName, double[] weeklyLikes) {
        this.CreatorName = creatorName;
        this.WeeklyLikes = weeklyLikes;
    }
}

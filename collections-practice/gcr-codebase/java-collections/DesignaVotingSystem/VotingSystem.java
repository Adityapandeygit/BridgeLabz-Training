package collections_practice.gcr_codebase.java_collections.DesignaVotingSystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class VotingSystemDemo {
	HashMap<String , Integer> voteCount = new HashMap<>();
	LinkedHashMap<String,Integer> voteOrder = new LinkedHashMap<>();
	
	public void castVote(String candidate) {
		 voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
		 voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
	}
	
	public void displayVoters() {
		for(String s :voteCount.keySet()) {
			System.out.println(s + " -> " + voteCount.get(s));
		}
	}
	
	public void displaySortedResults() {
		TreeMap<String ,Integer> sortedVoteOrder = new 	TreeMap<>(voteCount);
		for(String s :sortedVoteOrder.keySet()) {
			System.out.println(s + " -> " + sortedVoteOrder.get(s));
		}
	}
}
public class VotingSystem {
	public static void main(String[] args) {
		VotingSystemDemo system = new VotingSystemDemo();

        system.castVote("Rahul");
        system.castVote("Aditya");
        system.castVote("Alice");
        system.castVote("Aditya");
        system.castVote("Bob");
        system.displayVoters();
        System.out.println();
        system.displaySortedResults();
	}
}

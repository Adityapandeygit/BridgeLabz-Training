package oops_practice.scanrio_based.onlineVotingSystem;

public class Main {
	public static void main(String[] args) {
		ElectionService election = new ElectionServiceImpl();
		Voter v1 = new Voter(1, "Aditya");
        Voter v2 = new Voter(2, "Rahul");
        Candidate c1 = new Candidate(101, "Candidate A");
        Candidate c2 = new Candidate(102, "Candidate B");
        election.registerVoter(v1);
        election.registerVoter(v2);
        
        election.addCandidate(c1);
        election.addCandidate(c2);
        
        try {
            election.castVote(1, 101);
            election.castVote(2, 102);
            election.castVote(1, 102); // Duplicate vote
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        election.declareResult();
	}
}

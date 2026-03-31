package oops_practice.scanrio_based.onlineVotingSystem;

import java.util.ArrayList;
import java.util.List;

public class ElectionServiceImpl extends ElectionService {
	private List<Voter> voters = new ArrayList<>();
    private List<Candidate> candidates = new ArrayList<>();
    public void registerVoter(Voter voter) {
    	voters.add(voter);
    }
    public void addCandidate(Candidate candidate) {
    	candidates.add(candidate);
    }
    public void castVote(int voterId, int candidateId) throws DuplicateVoteException{
    	Voter voter = null;
    	Candidate  candidate  = null;
    	for (Voter v : voters) {
            if (v.getVoterId() == voterId) {
                voter = v;
                break;
            }
        }
    	for (Candidate c : candidates) {
            if (c.getCandidateId() == candidateId) {
                candidate = c;
                break;
            }
        }
    	if(voter.hasVoted()) {
    		throw new DuplicateVoteException("Voter has already voted!");
    	}
    	candidate.addVote();
    	voter.markVoted();
    	System.out.println(voter.getName() + " has voted " + candidate.getName());
    	
    }
    
    void declareResult() {
    	System.out.println("Election result : ");
    	for(Candidate c: candidates) {
    		System.out.println(c.getName() + " votes : " + c.getVoteCount());
    	}
    }

}

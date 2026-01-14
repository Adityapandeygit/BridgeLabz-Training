package dsa_practice.stack_queue_hashmap_hashfunction;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PairSum {
	public static boolean pairSum(int[] arr ,int target) {
		HashSet<Integer> set = new HashSet<>();
		for(int i :arr) {
			if(set.contains(target-i)) {
				return true;
			}
			set.add(i);
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,5,2,5,6};
		int target = 10;
		boolean ans = pairSum(arr,target);
		System.out.println(ans);
	}
}

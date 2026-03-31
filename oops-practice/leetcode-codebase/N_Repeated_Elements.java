package oops_practice.leetcode;

import java.util.HashMap;

public class N_Repeated_Elements {
	public int repeatedNTimes(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i)==nums.length/2){
                ans = i;
            }
        }
        return ans;
    }
}

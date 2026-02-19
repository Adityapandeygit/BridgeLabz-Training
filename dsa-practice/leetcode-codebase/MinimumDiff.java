package dsa_practice.leetcode_codebase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumDiff {
	public int minimumDifference(int[] nums, int k) {
        if (nums.length == 1 ) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int left = 0;
        while (left <= nums.length - k) {
            ArrayList<Integer> l = new ArrayList<>();
            int temp = left;   
            while (temp < left + k) {
                l.add(nums[temp]);   
                temp++;
            }
            min = Math.min(min, isMin(l));
            left++;   
        }

        return min;
    }

    public static int isMin(ArrayList<Integer> l) {
        Collections.sort(l);
        return l.get(l.size() - 1) - l.get(0);
        
    }
}

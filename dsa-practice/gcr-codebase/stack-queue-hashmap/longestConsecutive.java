package dsa_practice.stack_queue_hashmap_hashfunction;

import java.util.HashMap;

public class longestConsecutive {
	public static int longestConsecutive(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, true);
        }
        int longest = 0;
        for (int num : arr) {
            if (!map.containsKey(num - 1)) {
                int current = num;
                int count = 1;

                // Check consecutive numbers
                while (map.containsKey(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
	public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // 4
    }
}

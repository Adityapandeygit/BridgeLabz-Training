package dsa_practice.leetcode_codebase;

public class IsSorted {
	public boolean isSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int count =0;
        while(!isSorted(nums)){
            int idx = 0;
            int minSum = Integer.MAX_VALUE;
            for(int i=0;i<nums.length-1;i++){
                System.out.print(nums[i]);
                int sum =  nums[i]+nums[i+1];
                if(sum<minSum){
                    minSum = sum;
                    idx = i;
                }
            }
            int[] arr = new int[nums.length-1];
            int c = 0;
            for(int i=0;i<arr.length+1;i++){
                if(i==idx){
                    arr[c++] = minSum;
                    i++;
                }else
                arr[c++] = nums[i];
            }
            nums = arr;
            count++;
        }
        return count;
    }
}

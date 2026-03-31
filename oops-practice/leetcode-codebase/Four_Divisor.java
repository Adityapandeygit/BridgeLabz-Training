package oops_practice.leetcode;

public class Four_Divisor {
	public int sumFourDivisors(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            int sum=1+nums[i];
            int count=2;
            for(int j=2;j<=Math.sqrt(nums[i]);j++){ 
                if(nums[i]%j==0){
                    int d1 = j;
                    int d2 = nums[i]/j;
                    if(d1==d2){
                        sum+=d1;
                        count+=1;
                    }else{
                        sum+=d1+d2;
                        count+=2;
                    }
                }        
            }
            if(count==4){
                totalsum+=sum;
            }
        }
        return totalsum;
    }
}

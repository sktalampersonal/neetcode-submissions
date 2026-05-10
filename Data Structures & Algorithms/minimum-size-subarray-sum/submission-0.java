class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minLength= Integer.MAX_VALUE;
        int left,currentSum;
        left=currentSum=0;

        for(int i=0; i<nums.length; i++){

            currentSum+=nums[i];

            while(currentSum>=target){
                
                minLength=Math.min(minLength,i-left+1);
                currentSum-=nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE)?0:minLength;
    }
}
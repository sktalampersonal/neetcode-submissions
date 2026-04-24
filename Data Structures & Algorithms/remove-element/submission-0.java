class Solution {
    public int removeElement(int[] nums, int val) {
        
        //initiating the slow counter
        int k=0;

        for(int i: nums){

            if(i!=val){
                nums[k++]=i;
            }
        }

        return k;
    }
}
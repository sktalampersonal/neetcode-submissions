class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         HashMap<Integer,Integer> resultMap=new HashMap<>();

         for(int i=0;i<nums.length;i++){

            int num = nums[i];
            int diff = target - num;

            if(resultMap.containsKey(diff)){
                return new int[]{resultMap.get(diff),i};
            }

            resultMap.put(nums[i],i);
         }
         
         return new int[]{};
    }
}

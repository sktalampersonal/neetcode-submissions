class Solution {
    public int subarraySum(int[] nums, int k) {

        int count=0;
        int currentSum=0;

        HashMap<Integer,Integer> values =new HashMap<>();

        //base case
        values.put(0,1);

        for(int x: nums){

            currentSum+=x;
            
            if(values.containsKey(currentSum-k))
                count+=values.get(currentSum-k);

            values.put(currentSum,values.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
}
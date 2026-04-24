class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> check= new HashSet<>();
        for(int x:nums){
            if(check.contains(x))
            {
                return true;
            }
            else{
                check.add(x);
            }
        }
        return false;
    }
}
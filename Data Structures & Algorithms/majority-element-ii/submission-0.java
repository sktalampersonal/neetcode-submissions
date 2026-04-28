class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        List<Integer> res= new ArrayList<>();

        for(int x:map.keySet()){
            if(map.get(x)>nums.length/3)
                res.add(x);
        }

        return res;
    }
}
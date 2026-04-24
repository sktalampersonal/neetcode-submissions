class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> countMap = new HashMap<>();

        for(int n:nums){
            countMap.put(n,countMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> heap=
            new PriorityQueue<>((a,b)->countMap.get(a)-countMap.get(b));
            
        for(int n:countMap.keySet()){

            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] res=new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=heap.poll();
        }

        return res;
    }
}

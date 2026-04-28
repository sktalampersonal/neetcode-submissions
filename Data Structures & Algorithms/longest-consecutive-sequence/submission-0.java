class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> num = new HashSet<>();
        
        for(int i: nums){
            num.add(i);
        }

        int longestStreak = 0;

        for(int n: num){

            if(!num.contains(n-1)){

                int currentStreak=1;
                int currentNumber=n;

                while(num.contains(currentNumber+1)){
                    currentStreak+=1;
                    currentNumber+=1;
                }
                longestStreak= Math.max(longestStreak,currentStreak);
            }
        }

        return longestStreak;
    }
}

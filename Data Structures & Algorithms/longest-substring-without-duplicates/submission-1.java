class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> res= new HashSet<>();
        int leftIndex=0;
        int maxLength=0;

        for(int i=0;i<s.length();i++){

            while(res.contains(s.charAt(i))){
                res.remove(s.charAt(leftIndex));
                leftIndex++;
            }

            res.add(s.charAt(i));
            maxLength=Math.max(maxLength,i-leftIndex+1);
        }

        return maxLength;
    }
}

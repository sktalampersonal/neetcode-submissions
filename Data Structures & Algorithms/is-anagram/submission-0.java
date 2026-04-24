class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int n=s.length();   
        //ASCII array
        int[] charArray = new int[256];

        for(int i=0;i<n;i++){
            charArray[s.charAt(i)]++;
            charArray[t.charAt(i)]--;
        }

        for(int x: charArray){
            if(x!=0)
                return false;
        }
        return true;
    }
}
